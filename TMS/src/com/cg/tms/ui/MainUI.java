package com.cg.tms.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;
import com.cg.tms.service.TicketService;
import com.cg.tms.service.TicketServiceImpl;
import com.cg.tms.util.Util;

public class MainUI {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
         String exit=null;
		do {
			System.out.println("Welcome to ITMD Help Desk");
			System.out.println("");
			System.out.println("1. Raise a Ticket");
			System.out.println("2. 1Exit from the System");
			int choice=s.nextInt();
			int n=1;
			switch(choice) {
			
			case 1:
			  	    System.out.println("Select Ticket Category fron below List :");
			  	    Map<String,String>  hm  = Util.getTicketCategoryEntries();
			  	    Collection<String> c = hm.values();
			  	    List al = new ArrayList(c);
			  	    
			  	      Iterator i = al.iterator();
			  	    while(i.hasNext()) {
			  	    	System.out.print(n++);
			  	    	System.out.println(" :"+i.next());
			  	    	
			  	    }
			  	    
			  	    System.out.println(" ");
			  	    
			  	    System.out.print("Enter Option : ");
			  	    int opt =s.nextInt();
			  	    
			  	    TicketCategory tc= new TicketCategory();
			  	    
			  	    double tcid =Math.random();
			  	    
			  	    			  	
			  	    switch(opt){
			  	    case 1 : tc.setTicketCategoryId("tc1001");
			  	             tc.setCategoryName("software installation");
			  	              n=1;
			  	            break;
			  	            
			  	    case 2 : tc.setTicketCategoryId("tc002");
			  	    	     tc.setCategoryName("mailbox creation");
	  	                        n=1;
	  	                        break;    
	  	                        
			  	    case 3: tc.setTicketCategoryId("tc003");
			  	    	    tc.setCategoryName("mailbox issues");
			  	             n=1;
	  	                     break;	
			  	    }
			  	    
			  	    TicketBean tb = new TicketBean();
			  	    tb.setTicketNo(Math.random());
			  	    tb.setTicketCategoryId(tc.getTicketCategoryId());
			  	    
			        System.out.print("Enter Descrption Related to issue : ");
			        String des=s.next();
			        tb.setTicketDescription(des);
			        
			        System.out.print("1.Low 2.medium 3. high : ");
			        int  prity=s.nextInt();
			        switch(prity) {
			        
			        case 1:
                            tb.setTicketPriority("low");
			        	   break;
			        case 2: 
			        	   tb.setTicketPriority("medium");
			        	    break;
			        case 3: 
			        	  tb.setTicketPriority("high");
			        	   break;
			         
			        
			        }
			        
			        tb.setTicketStatus("New");
			        String d = new Date().toString();
			        
			        tb.setItimdComments(d);
			        
			        TicketService ts = new TicketServiceImpl();
			        
			        boolean b = ts.raiseNewTicket(tb);
			        if(b==true) {
			        System.out.println("Ticket Number "+tb.getTicketNo()+" logged successfully at "+tb.getItimdComments());
			        }
			        else {
			        	
			        	System.out.println("Ticket No not generated ");
			        }
				    break;
				    
			case 2: System.out.println("Exit from Execution");
			        exit="Y";
				    break;
				
				
			}
			
			
			
			
			
		}while(exit!="Y");		
		
	}

}
