package com.panditg.demo.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.panditg.demo.mappers.BookingMapper;
import com.panditg.demo.mappers.VidhiPanditMapper;
import com.panditg.demo.model.BookingInfoModel;
import com.panditg.demo.model.VidhiPanditModel;

@Repository
public class BookingDao {

	@Autowired
	private DataSource dataSource;

	private NamedParameterJdbcTemplate jdbcTemplate;

	private static final String INSERT_BOOK_PANDIT = "insert into booking(client_id,vidhi_pandit_id) values(:clientId,:vidhiPanditId)";
	private static final String SELECT_BOOKINGS_BY_CLIENT_ID = "select * from booking where client_id = :clientId";
	
	@PostConstruct
	public void setUp() {
		jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	
	
	public int postBookPandit(final BookingInfoModel bookingInfo) {
		final Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("clientId", bookingInfo.getClientId());
		paramMap.put("vidhiPanditId", bookingInfo.getVidhiPanditId());

		final int affectedRows = jdbcTemplate.update(INSERT_BOOK_PANDIT, paramMap);

		return affectedRows;
	}

	public List<BookingInfoModel> getBookingsByClientId(long clientId) {
		final Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("clientId", clientId);

		return jdbcTemplate.query(SELECT_BOOKINGS_BY_CLIENT_ID, paramMap, new BookingMapper());
	}

}
