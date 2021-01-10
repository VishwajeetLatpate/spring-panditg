package com.panditg.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.panditg.demo.entities.Pandit;

public interface PanditDao extends JpaRepository<Pandit, Long> {

}
