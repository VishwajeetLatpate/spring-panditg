package com.panditg.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panditg.demo.dao.PanditDao;
import com.panditg.demo.entities.Pandit;
import com.panditg.demo.service.PanditService;

@Service
public class PanditServiceImp implements PanditService {
	
	@Autowired
	private PanditDao panditDao;

	@Override
	public List<Pandit> getPandit() {
		// TODO Auto-generated method stub
		return panditDao.findAll();
		
	}
	
	@Override
	public Pandit addPandit(Pandit pandit) {
		panditDao.save(pandit);
		return pandit;
	}



}
