package com.panditg.demo.model;

public class BookingInfoModel {
	long bookingId;
	long clientId;
    long vidhiPanditId;
    String date;
    
	public long getBookingId() {
		return bookingId;
	}
	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}
	public long getClientId() {
		return clientId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setClientId(long clientId) {
		this.clientId = clientId;
	}
	public long getVidhiPanditId() {
		return vidhiPanditId;
	}

	public void setVidhiPanditId(long vidhiPanditId) {
		this.vidhiPanditId = vidhiPanditId;
	}
}
