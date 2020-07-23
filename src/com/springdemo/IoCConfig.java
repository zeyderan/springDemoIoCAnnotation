package com.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//ayarlarý applicationContext.xml den deðil buradan okuyacak
@Configuration
@ComponentScan("com.springdemo")
@PropertySource("classpath:values.properties")
public class IoCConfig {
//	xml yerine buradan bean tanýmlýyoruz
	@Bean
	public ICustomerDal database() {
		return new CustomerDalOracle();
	}
	
	@Bean
	public ICustomerService service() {
		return new CustomerManager(database());
	}
}
