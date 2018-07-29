package com.cmbchina.cc.amdatashift.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cmbchina.cc.amdatashift.dao.ModelDao;
import com.cmbchina.cc.amdatashift.entity.Model;

@Repository
public class ModelDaoImpl implements ModelDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public Model getModel(int modelId) {
		
		String sql = "SELECT * FROM netapi where modelId = ?";
		RowMapper<Model> rowMapper = new BeanPropertyRowMapper<>(Model.class);
		Model model = jdbcTemplate.queryForObject(sql, rowMapper, modelId);
		return model;
	}
}
