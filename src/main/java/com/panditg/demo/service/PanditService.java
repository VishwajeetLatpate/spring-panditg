package com.panditg.demo.service;

import java.util.List;

import com.panditg.demo.entities.Pandit;
import com.panditg.demo.model.PanditModel;

public interface PanditService {
	public List<PanditModel> getPanditByVidhiName(String vidhiName);
	public Pandit addPandit(Pandit pandit);
	public Pandit fetchPanditByEmailIdAndPassword(String tempEmailId, String tempPass);
}
