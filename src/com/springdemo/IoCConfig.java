package com.springdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//ayarlarý applicationContext.xml den deðil buradan okuyacak
@Configuration
@ComponentScan("com.springdemo")
public class IoCConfig {

}
