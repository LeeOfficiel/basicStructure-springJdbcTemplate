package com.cmbchina.cc.amdatashift.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cmbchina.cc.amdatashift.entity.Model;
import com.cmbchina.cc.amdatashift.service.ModelService;

@Controller
@RequestMapping("/model")
public class ModelController {
	
	@Autowired
	private ModelService modelService;
	
	@RequestMapping("/{modelId}")
	public Model getModel(@PathVariable("modelId") int modelId){
		System.out.println(modelId);
		Model model=modelService.getModel(modelId);
		return model;
	}
	
    @RequestMapping("/index")
    public String index(){
    	System.out.println("nihao");
    	
    	return "demo";
    }
}
