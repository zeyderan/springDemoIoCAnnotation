package com.springdemo;

import org.springframework.stereotype.Component;

//mysql için crud iþlemleri
public class CustomerDalMysql implements ICustomerDal {
	String connectionString;
	public String getConnectionString() {
		return connectionString;
	}
	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	//virtual add
	public void add() {
		System.out.println("Connection String :"+this.connectionString);
		System.out.println("Mysql veri tabanýna eklendi");
	}
}
