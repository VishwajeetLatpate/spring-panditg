package com.panditg.demo.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.panditg.demo.model.VidhiPanditModel;

public class VidhiPanditMapper implements RowMapper<VidhiPanditModel> {

	@Override
	public VidhiPanditModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		final VidhiPanditModel vidhiPandit = new VidhiPanditModel();
		vidhiPandit.setId(rs.getLong("id"));
		vidhiPandit.setPanditId(rs.getLong("pandit_id"));
		vidhiPandit.setDakshina(rs.getDouble("dakshina"));
		vidhiPandit.setVidhiId(rs.getLong("vidhi_id"));
		return vidhiPandit;
	}

}
