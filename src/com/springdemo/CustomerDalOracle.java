package com.springdemo;

import org.springframework.stereotype.Component;

//oracle veritabaný içi crud iþlemleri

//@component anotasyonu ile dependency injection iþlemi
@Component("database")
public class CustomerDalOracle implements ICustomerDal {
	String connectionString;
	public String getConnectionString() {
		return connectionString;
	}
	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	public void add() {
		System.out.println("Connection String :"+this.connectionString);
		System.out.println("orale veri tabanýna eklendi");
	}
}
