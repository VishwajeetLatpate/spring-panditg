package com.panditg.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panditg.demo.dao.PanditDao;
import com.panditg.demo.dao.VidhiDao;
import com.panditg.demo.dao.VidhiPanditDao;
import com.panditg.demo.entities.Pandit;
import com.panditg.demo.entities.Vidhi;
import com.panditg.demo.model.PanditModel;
import com.panditg.demo.model.VidhiPanditModel;
import com.panditg.demo.service.PanditService;

@Service
public class PanditServiceImp implements PanditService {

	@Autowired
	private PanditDao panditDao;

	@Autowired
	private VidhiDao vidhiDao;

	@Autowired
	private VidhiPanditDao vidhiPanditDao;

	@Override
	public List<PanditModel> getPanditByVidhiName(final String vidhiName) {
		// get vidhi_id from vidhiName.
		final Vidhi vidhi = vidhiDao.findByName(vidhiName);

		// get relevant data from vidhi_pandit
		final List<VidhiPanditModel> vidhiPanditList = vidhiPanditDao.getPanditIdListByVidhiId(vidhi.getId());

		final List<PanditModel> panditModels = new ArrayList<>();
		for (final VidhiPanditModel vidhiPandit : vidhiPanditList) {
			final Pandit pandit = panditDao.findById(vidhiPandit.getPanditId()).get();

			final PanditModel panditModel = new PanditModel();
			panditModel.setId(pandit.getId());
			panditModel.setFirstName(pandit.getFirstName());
			panditModel.setLastName(pandit.getLastName());
			panditModel.setCity(pandit.getCity());
			panditModel.setContactNumber(pandit.getContactNumber());
			panditModel.setEmailId(pandit.getEmailId());
			panditModel.setPassword(pandit.getPassword());
			panditModel.setVidhiPanditId(vidhiPandit.getId());
			panditModel.setDakshina(vidhiPandit.getDakshina());

			panditModels.add(panditModel);
		}
		// Make list of it
		return panditModels;
	}

	@Override
	public Pandit addPandit(Pandit pandit) {
		panditDao.save(pandit);
		return pandit;
	}

}
