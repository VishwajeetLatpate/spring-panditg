package com.panditg.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.panditg.demo.entities.Client;
import com.panditg.demo.entities.Pandit;
import com.panditg.demo.model.PanditModel;
import com.panditg.demo.service.PanditService;
@CrossOrigin
@RestController
public class PanditController {

	@Autowired
	private PanditService panditService;

	@GetMapping("/pandit")
	public List<PanditModel> getPandit(@RequestParam final String vidhiName) {
		return this.panditService.getPanditByVidhiName(vidhiName);
	}

	@PostMapping("/post-pandit")
	public Pandit addPandit(@RequestBody Pandit pandit) {
		return this.panditService.addPandit(pandit);
	}
	
	@PostMapping("/login-pandit")
	public Pandit loginPandit(@RequestBody Pandit pandit) throws Exception{
		String tempEmailId=pandit.getEmailId();
		String tempPass=pandit.getPassword();
		Pandit panditObj=null;
		if(tempEmailId !=null && tempPass != null) {
		 panditObj = panditService.fetchPanditByEmailIdAndPassword(tempEmailId, tempPass);

		}
		if(panditObj ==null) {
			throw new Exception("Bad credintials");
		}
		 return panditObj;
	}

}
