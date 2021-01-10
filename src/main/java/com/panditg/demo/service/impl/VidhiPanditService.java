package com.panditg.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panditg.demo.dao.VidhiDao;
import com.panditg.demo.dao.VidhiPanditDao;
import com.panditg.demo.entities.Vidhi;
import com.panditg.demo.model.VidhiPanditModel;

@Service
public class VidhiPanditService {

	@Autowired
	private VidhiPanditDao vidhiPanditDao;
	
	@Autowired
	private VidhiDao vidhiDao;
	
	public int postVidhiPandit(final VidhiPanditModel vidhiPanditModel) {
		final Vidhi vidhi = vidhiDao.findByName(vidhiPanditModel.getVidhiName());
		
		vidhiPanditModel.setVidhiId(vidhi.getId());

		return vidhiPanditDao.postVidhiPandit(vidhiPanditModel);
	}
	
}
