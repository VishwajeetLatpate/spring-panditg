package com.panditg.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.panditg.demo.model.BookedPandit;
import com.panditg.demo.model.BookingInfoModel;
import com.panditg.demo.service.impl.BookingService;
@CrossOrigin
@RestController
public class BookingController {
	
	@Autowired
	private BookingService bookingService;
   
	@PostMapping("/booking")
	public int bookPandit(@RequestBody BookingInfoModel bookingInfo) {
		return bookingService.bookPandit(bookingInfo);
	}

	@GetMapping("/booking")
	public List<BookedPandit> getBooking(@RequestParam final long clientId){
		return bookingService.getBooking(clientId);
	}
	
}
