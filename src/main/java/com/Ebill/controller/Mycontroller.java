package com.Ebill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Ebill.Model.Consumer;
import com.Ebill.service.Consumerserviceimp;

@Controller
public class Mycontroller {
	
	@Autowired
	private Consumerserviceimp service;
	
	@RequestMapping("/")
	public String homepage()
	{
		return "home";
	}
	
	@RequestMapping("/addconsumer")
	public String regPage()
	{
		return "register";
	}
	
	@RequestMapping("/save")
	public String save(Consumer consumer,ModelMap model)
	{
		Consumer c1=service.saveconsumer(consumer);
		return "success";
		
	}
	
	@RequestMapping("/viewrecords")
	public String viewRecords(ModelMap model)
	{
		model.put("consumers", service.getAllConumers());
		return "viewconsumers";
	}
	
	
	@RequestMapping("/delete/{cid}")
	public String deleteRecord(@PathVariable int cid)
	{
		service.deleteconsumer(cid);
		return"redirect:/viewrecords";
	}
	
	
	@RequestMapping("/update/{cid}")
	public String update(@PathVariable int cid,ModelMap model)
	{
		model.put("command",service.getconsumer(cid));
		return "edit";
	}
	
	
	@RequestMapping("/editu")
	public String updatesave(Consumer consumer,ModelMap model)
	{
		service.updateconsumer(consumer);
		return "redirect:/viewrecords";
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
