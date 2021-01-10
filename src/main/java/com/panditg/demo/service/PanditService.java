package com.panditg.demo.service;

import java.util.List;

import com.panditg.demo.entities.Pandit;

public interface PanditService {
	
	public List<Pandit> getPandit();
	public Pandit addPandit(Pandit pandit);

}
