package com.springdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//ayarlar� applicationContext.xml den de�il buradan okuyacak
@Configuration
@ComponentScan("com.springdemo")
public class IoCConfig {

}
