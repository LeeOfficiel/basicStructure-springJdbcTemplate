package com.cmbchina.cc.amdatashift.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmbchina.cc.amdatashift.dao.ModelDao;
import com.cmbchina.cc.amdatashift.entity.Model;
import com.cmbchina.cc.amdatashift.service.ModelService;


@Service
public class ModelServiceImpl implements ModelService{
	
	@Autowired
	private ModelDao modelDao;
	
	public Model getModel(int modelId) {
		Model model=modelDao.getModel(modelId);
		return model;
	}

}
