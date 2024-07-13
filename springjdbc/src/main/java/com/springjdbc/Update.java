package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Update {
	public static void main(String[] args) {
		
		ApplicationContext context= new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
		
		JdbcTemplate jdbcTemplate=	context.getBean(JdbcTemplate.class);
		
		int studentAge=34;
		int studenyId =3;

		String Query="UPDATE students set studentAge=? where studentId=?";
		
	int count=	jdbcTemplate.update(Query,studentAge,studenyId);

	if(count >0) {
		System.out.println("UPDATE SUCCESSFULLY");
		
	}
	else {
		System.out.println("NOT UPDATED DUE TO SOME INTERNL PROBLEM");
	}
		
		
		
		
	}

}
