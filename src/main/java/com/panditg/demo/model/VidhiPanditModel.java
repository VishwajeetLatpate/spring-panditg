package com.panditg.demo.model;

public class VidhiPanditModel {

	private long id;
	private long vidhiId;
	private String vidhiName;
	private long panditId;
	private double dakshina;
    private String date;
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public double getDakshina() {
		return dakshina;
	}

	public void setDakshina(double dakshina) {
		this.dakshina = dakshina;
	}

	public String getVidhiName() {
		return vidhiName;
	}

	public void setVidhiName(String vidhiName) {
		this.vidhiName = vidhiName;
	}
	
	

}
