package com.Ebill.service;

import java.util.List;

import com.Ebill.Model.Consumer;


public interface Consumerservice {
	
	
	public Consumer saveconsumer(Consumer consumer);
	public Consumer updateconsumer(Consumer consumer);
	public void deleteconsumer(int cid);
	public Consumer getconsumer(int cid);
	public List<Consumer>getAllConumers();

}
