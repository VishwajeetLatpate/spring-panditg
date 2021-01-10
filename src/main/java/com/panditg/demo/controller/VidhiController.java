package com.panditg.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.panditg.demo.entities.Vidhi;
import com.panditg.demo.service.impl.VidhiServiceImpl;

@CrossOrigin
@RestController
public class VidhiController {

	@Autowired
	private VidhiServiceImpl vidhiService;

	@GetMapping("/vidhi")
	public List<Vidhi> getVidhies() {
		return this.vidhiService.getVidhies();
	}

}
