package com.cg.tms.dto;

public class TicketBean {

	private double ticketNo;
	private String ticketCategoryId;
	private String ticketDescription;
	private String ticketPriority;
	private String ticketStatus;
	private String itimdComments;
	public TicketBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TicketBean(double ticketNo, String ticketCategoryId, String ticketDescription, String ticketPriority,
			String ticketStatus, String itimdComments) {
		super();
		this.ticketNo = ticketNo;
		this.ticketCategoryId = ticketCategoryId;
		this.ticketDescription = ticketDescription;
		this.ticketPriority = ticketPriority;
		this.ticketStatus = ticketStatus;
		this.itimdComments = itimdComments;
	}
	public double getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(double ticketNo) {
		this.ticketNo = ticketNo;
	}
	public String getTicketCategoryId() {
		return ticketCategoryId;
	}
	public void setTicketCategoryId(String ticketCategoryId) {
		this.ticketCategoryId = ticketCategoryId;
	}
	public String getTicketDescription() {
		return ticketDescription;
	}
	public void setTicketDescription(String ticketDescription) {
		this.ticketDescription = ticketDescription;
	}
	public String getTicketPriority() {
		return ticketPriority;
	}
	public void setTicketPriority(String ticketPriority) {
		this.ticketPriority = ticketPriority;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	public String getItimdComments() {
		return itimdComments;
	}
	public void setItimdComments(String itimdComments) {
		this.itimdComments = itimdComments;
	}
	
	
	
	
}
