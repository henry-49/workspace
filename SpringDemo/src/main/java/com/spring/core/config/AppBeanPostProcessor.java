package com.spring.core.config;

import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class AppBeanPostProcessor implements BeanPostProcessor {
 public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
	// TODO Auto-generated method stub
	 System.out.println(beanName+ " post Process After Initialization"+ new Date());
	return bean;
}
 
 public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
	 System.out.println(beanName+ " post Process Before Initialization at"+ new Date());
		return bean;
	}
}
