package com.springdemo;

public class CustomerManager implements ICustomerService{
	ICustomerDal customerDal;
	//contructor injection
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
//	setter injection
//	public void setCustomerDal(ICustomerDal customerDal) {
//		this.customerDal = customerDal;
//	}
	
	public void add() {
		customerDal.add();
	}

	
}
