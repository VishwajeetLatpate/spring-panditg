package com.panditg.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.panditg.demo.model.VidhiPanditModel;
import com.panditg.demo.service.impl.VidhiPanditService;
@CrossOrigin
@RestController
public class VidhiPanditController {
	
	@Autowired
	private VidhiPanditService vidhiPanditService;

	@PostMapping("vidhi-pandit")
	public int postVidhiPandit(@RequestBody final VidhiPanditModel vidhiPanditModel) {
		return vidhiPanditService.postVidhiPandit(vidhiPanditModel);
	}
}
