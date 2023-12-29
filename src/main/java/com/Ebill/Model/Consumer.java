package com.Ebill.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Consumer {
	
	@Id
	private int cid;
	private String cname;
	private double crreading;
	private double prreading;
	private double units;
	private double service_charges;
	private double total_bill;
	public Consumer() {
		super();
	}
	public Consumer(int cid, String cname, double crreading, double prreading, double units, double service_charges,
			double total_bill) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.crreading = crreading;
		this.prreading = prreading;
		this.units = units;
		this.service_charges = service_charges;
		this.total_bill = total_bill;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public double getCrreading() {
		return crreading;
	}
	public void setCrreading(double crreading) {
		this.crreading = crreading;
	}
	public double getPrreading() {
		return prreading;
	}
	public void setPrreading(double prreading) {
		this.prreading = prreading;
	}
	public double getUnits() {
		return units;
	}
	public void setUnits(double units) {
		this.units = units;
	}
	public double getService_charges() {
		return service_charges;
	}
	public void setService_charges(double service_charges) {
		this.service_charges = service_charges;
	}
	public double getTotal_bill() {
		return total_bill;
	}
	public void setTotal_bill(double total_bill) {
		this.total_bill = total_bill;
	}
	@Override
	public String toString() {
		return "Consumer [cid=" + cid + ", cname=" + cname + ", crreading=" + crreading + ", prreading=" + prreading
				+ ", units=" + units + ", service_charges=" + service_charges + ", total_bill=" + total_bill + "]";
	}

	
	


}
