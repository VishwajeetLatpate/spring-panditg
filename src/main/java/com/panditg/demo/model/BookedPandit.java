package com.panditg.demo.model;

public class BookedPandit {

	private long bookingId;
	
	private long vidhiId;
	private String vidhiName;
	
	private long panditId;
	private String panditName;
	
	private long vidhiPanditId;
	private double dakshina;

	public long getBookingId() {
		return bookingId;
	}
	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}
	public String getVidhiName() {
		return vidhiName;
	}
	public void setVidhiName(String vidhiName) {
		this.vidhiName = vidhiName;
	}
	public String getPanditName() {
		return panditName;
	}
	public void setPanditName(String panditName) {
		this.panditName = panditName;
	}
	public double getDakshina() {
		return dakshina;
	}
	public void setDakshina(double dakshina) {
		this.dakshina = dakshina;
	}
	public long getVidhiId() {
		return vidhiId;
	}
	public void setVidhiId(long vidhiId) {
		this.vidhiId = vidhiId;
	}
	public long getPanditId() {
		return panditId;
	}
	public void setPanditId(long panditId) {
		this.panditId = panditId;
	}
	public long getVidhiPanditId() {
		return vidhiPanditId;
	}
	public void setVidhiPanditId(long vidhiPanditId) {
		this.vidhiPanditId = vidhiPanditId;
	}
	
	
	
}
