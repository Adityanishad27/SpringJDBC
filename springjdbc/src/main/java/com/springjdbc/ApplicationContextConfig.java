package com.springjdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class ApplicationContextConfig   {
	
	@Bean
	public DriverManagerDataSource mydatasource() {
		
		DriverManagerDataSource datasource= new DriverManagerDataSource();
		
		
		datasource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		datasource.setUsername("root");
		datasource.setPassword("root");
		return datasource;
		
	}
	
	@Bean
	public JdbcTemplate myjdbctempete() {
		
		
		JdbcTemplate jdbcTemplate= new JdbcTemplate();
		jdbcTemplate.setDataSource(mydatasource());
		
		return jdbcTemplate;
		
	}

}
