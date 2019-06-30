package com.spring.firstapp.SpringJan;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

///import com.spring.course.SpringJan.beans.Car;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context =  new ClassPathXmlApplicationContext("spring-jdbc.xml");
		
		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
		
		jdbcTemplate.update("insert into engine (id, name, model) values (?, ?, ?)", 1,"K10", "2018");
		System.out.println("done");
		
		// DDL 
		
		/*jdbcTemplate.execute("create table engine (id integer, name varchar(100), model varchar(100))");
		
		System.out.println("Table created");*/
		
		// =============== DELETE ===================
		//jdbcTemplate.update("delete from car where id = ?", 6);
		
		
		
		
		//=============== INSERT ===================
		
		/*
		jdbcTemplate.update("insert into car (name, model) values (?, ?)", "Hundai", "2018");
		jdbcTemplate.update("insert into car (name, model) values (?, ?)", "Honda", "2019");
		
		System.out.println("Done");
		*/
		
		
		//============== SELECT ===================
		/**
		 * int rowCount = jdbcTemplate.queryForObject("select count(*) from car", Integer.class);
		 * System.out.println(rowCount);
		 */
		
		/*int countOfActorsNamedJoe = jdbcTemplate.queryForObject("select count(*) from car where name = ?", Integer.class, "audi");
		System.out.println(countOfActorsNamedJoe);*/
		
		/*String name = jdbcTemplate.queryForObject("select name from car where id = ?", new Object[]{1}, String.class);
		System.out.println(name);
		
		String model = jdbcTemplate.queryForObject("select model from car where id = ?", new Object[]{2}, String.class);
		System.out.println(model);*/
		
		
	/*	List<Map<String, Object>> list  = jdbcTemplate.queryForList("select * from car");
		list.forEach(item -> {
			  for (Map.Entry<String,Object> entry : item.entrySet()) {
				  System.out.println(entry.getKey() + " - " + entry.getValue());
			  }
		});*/
	}
}















