package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Delete {
	public static void main(String[] args) {
		
	ApplicationContext context= new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
		
		JdbcTemplate jdbcTemplate=	context.getBean(JdbcTemplate.class);
		
		
		int studenyId =3;

		String Query="DELETE FROM students  where studentId=?";
		
	int count=	jdbcTemplate.update(Query,studenyId);

	if(count >0) {
		System.out.println("DELETE  SUCCESSFULLY");
		
	}
	else {
		System.out.println("NOT DELETED DUE TO SOME INTERNL PROBLEM");
	}
		
		
		
	}

}
