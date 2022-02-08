package com.cg.tms.service;

import java.util.List;

import com.cg.tms.dao.TicketDAO;
import com.cg.tms.dao.TicketDAOImpl;
import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;

public class TicketServiceImpl  implements TicketService{

	@Override
	public boolean raiseNewTicket(TicketBean ticketBean) {

         TicketDAO tdao = new TicketDAOImpl();
         boolean b = tdao.raiseNewTicket(ticketBean);
		
		return b;
	}

	@Override
	public List<TicketCategory> listTicketCategory() {
		// TODO Auto-generated method stub
		return null;
	}

}
