package com.cg.tms.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;
import com.cg.tms.util.Util;

public class TicketDAOImpl implements TicketDAO{
  
	 Map hm = new HashMap<>();
	
	@Override
	public boolean raiseNewTicket(TicketBean ticketBean) {
		
         hm.put(ticketBean.getTicketNo(), ticketBean);	
		
		return true;
	}

	@Override
	public List<TicketCategory> listTicketCategory() {
		List <TicketCategory>l = new ArrayList<TicketCategory>();
		
		Map<String,String>  m  = Util.getTicketCategoryEntries();
      Set<String>sm = m.keySet();
		
		Iterator<String> i = sm.iterator();
		
		while(i.hasNext()) {
			TicketCategory tc = new TicketCategory();
			String key=(String)i.next();
		    tc.setTicketCategoryId(key);
		    tc.setCategoryName(m.get(key));
		  l.add(tc);  
		}
		return l;
	}

}
