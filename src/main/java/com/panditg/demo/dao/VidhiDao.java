package com.panditg.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.panditg.demo.entities.Vidhi;

public interface VidhiDao extends JpaRepository<Vidhi, Long>{

	Vidhi findByName(String vidhiName);

}
