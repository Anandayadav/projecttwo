package com.Ebill.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ebill.Model.Consumer;
import com.Ebill.repo.Consumerrepo;

@Service
public class Consumerserviceimp implements Consumerservice {

	@Autowired
	private Consumerrepo repo;

	@Override
	public Consumer saveconsumer(Consumer consumer) {
		
		double units=0.0,scharge=120.0,tbill=0.0;
		
		units=consumer.getCrreading()-consumer.getPrreading();
		
		if(units>=500)
		{
			tbill=(7.25*units)+scharge;
		}
		else if(units>=300)
		{
			tbill=(3.25*units)+scharge;
		}
		else
		{
			tbill=(1.25*units)+scharge;
		}
		
		consumer.setTotal_bill(tbill);
		consumer.setService_charges(scharge);
		consumer.setUnits(units);
		
		return repo.save(consumer);
	}

	
	@Override
	public List<Consumer> getAllConumers() {
		List<Consumer> consumerlist=(List<Consumer>) repo.findAll();
		return consumerlist;
	}
	
	
	@Override
	public Consumer updateconsumer(Consumer consumer) {
double units=0.0,scharge=120.0,tbill=0.0;
		
		units=consumer.getCrreading()-consumer.getPrreading();
		
		if(units>=500)
		{
			tbill=(7.25*units)+scharge;
		}
		else if(units>=300)
		{
			tbill=(3.25*units)+scharge;
		}
		else
		{
			tbill=(1.25*units)+scharge;
		}
		
		consumer.setTotal_bill(tbill);
		consumer.setService_charges(scharge);
		consumer.setUnits(units);
		
		return repo.save(consumer);
	}

	
	@Override
	public void deleteconsumer(int cid) {
		repo.deleteById(cid);

	}

	
	@Override
	public Consumer getconsumer(int cid) {
		Consumer getone=repo.findById(cid).get();
		return getone;
	}

	

}
