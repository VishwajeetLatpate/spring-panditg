package com.panditg.demo.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.panditg.demo.mappers.VidhiPanditMapper;
import com.panditg.demo.model.VidhiPanditModel;

@Repository
public class VidhiPanditDao {

	@Autowired
	private DataSource dataSource;

	private NamedParameterJdbcTemplate jdbcTemplate;

	private static final String GET_VIDHI_PANDIT_BY_VIDHI_ID = "select * from vidhi_pandit where vidhi_id = :vidhiId";
	private static final String GET_VIDHI_PANDIT_BY_VIDHI_PANDIT_ID = "select * from vidhi_pandit where id = :vidhiPanditId";
	private static final String INSERT_VIDHI_PANDIT = "insert into vidhi_pandit(vidhi_id,pandit_id,dakshina) values(:vidhiId,:panditId,:dakshina)";

	@PostConstruct
	public void setUp() {
		jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	public List<VidhiPanditModel> getPanditIdListByVidhiId(final long vidhiId) {
		final Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("vidhiId", vidhiId);
		final List<VidhiPanditModel> vidhiPanditList = jdbcTemplate.query(GET_VIDHI_PANDIT_BY_VIDHI_ID, paramMap,
				new VidhiPanditMapper());
		return vidhiPanditList;
	}

	public int postVidhiPandit(final VidhiPanditModel vidhiPanditModel) {
		final Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("vidhiId", vidhiPanditModel.getVidhiId());
		paramMap.put("panditId", vidhiPanditModel.getPanditId());
		paramMap.put("dakshina", vidhiPanditModel.getDakshina());

		final int affectedRows = jdbcTemplate.update(INSERT_VIDHI_PANDIT, paramMap);

		return affectedRows;
	}

	public VidhiPanditModel getVidhiPandit(long vidhiPanditId) {
		final Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("vidhiPanditId", vidhiPanditId);

		return jdbcTemplate.queryForObject(GET_VIDHI_PANDIT_BY_VIDHI_PANDIT_ID, paramMap, new VidhiPanditMapper());
	}

}
