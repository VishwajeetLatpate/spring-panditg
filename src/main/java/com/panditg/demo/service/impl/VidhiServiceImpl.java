package com.panditg.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panditg.demo.dao.VidhiDao;
import com.panditg.demo.entities.Vidhi;

@Service
public class VidhiServiceImpl {

	@Autowired
	private VidhiDao vidhiDao;

	public List<Vidhi> getVidhies() {
		return vidhiDao.findAll();
	}
}
