package com.panditg.demo.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.panditg.demo.model.BookingInfoModel;
import com.panditg.demo.model.VidhiPanditModel;

public class BookingMapper implements RowMapper<BookingInfoModel> {

	@Override
	public BookingInfoModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		final BookingInfoModel bookingInfoModel = new BookingInfoModel();
		bookingInfoModel.setBookingId(rs.getLong("booking_id"));
		bookingInfoModel.setClientId(rs.getLong("client_id"));
		bookingInfoModel.setVidhiPanditId(rs.getLong("vidhi_pandit_id"));
		bookingInfoModel.setDate(rs.getString("date"));
		return bookingInfoModel;
	}

}
