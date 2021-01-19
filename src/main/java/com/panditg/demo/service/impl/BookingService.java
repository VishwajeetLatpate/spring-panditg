package com.panditg.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panditg.demo.dao.BookingDao;
import com.panditg.demo.dao.PanditDao;
import com.panditg.demo.dao.VidhiDao;
import com.panditg.demo.dao.VidhiPanditDao;
import com.panditg.demo.entities.Pandit;
import com.panditg.demo.entities.Vidhi;
import com.panditg.demo.model.BookedPandit;
import com.panditg.demo.model.BookingInfoModel;
import com.panditg.demo.model.VidhiPanditModel;

@Service
public class BookingService {

	@Autowired
	private BookingDao bookingDao;

	@Autowired
	private VidhiPanditDao vidhiPanditDao;

	@Autowired
	private PanditDao panditDao;

	@Autowired
	private VidhiDao vidhiDao;

	public int bookPandit(final BookingInfoModel bookingInfo) {
		return bookingDao.postBookPandit(bookingInfo);
	}

	public List<BookedPandit> getBooking(long clientId) {
		final List<BookedPandit> bookedPandits = new ArrayList<>();
		
		// Get all bookings related to given client id
		List<BookingInfoModel> bookings = this.bookingDao.getBookingsByClientId(clientId);

		for (final BookingInfoModel bookingInfoModel : bookings) {
			// Get dakshina, pandit_id, vidhi_id from vidhi_pandit_id
			final VidhiPanditModel vidhiPandit = this.vidhiPanditDao
					.getVidhiPandit(bookingInfoModel.getVidhiPanditId());

			// Get pandit from pandit_id
			final Pandit pandit = this.panditDao.findById(vidhiPandit.getPanditId()).get();

			// Get vidhi from vidhi_id
			final Vidhi vidhi = this.vidhiDao.findById(vidhiPandit.getVidhiId()).get();

			final BookedPandit bookedPandit = new BookedPandit();
			bookedPandit.setBookingId(bookingInfoModel.getBookingId());
			
			bookedPandit.setVidhiPanditId(vidhiPandit.getId());
			bookedPandit.setDakshina(vidhiPandit.getDakshina());
			
			bookedPandit.setPanditId(pandit.getId());
			bookedPandit.setPanditName(pandit.getFirstName() + " " + pandit.getLastName());
			
			bookedPandit.setVidhiId(vidhi.getId());
			bookedPandit.setVidhiName(vidhi.getName());

			bookedPandits.add(bookedPandit);
		}

		return bookedPandits;
	}
}
