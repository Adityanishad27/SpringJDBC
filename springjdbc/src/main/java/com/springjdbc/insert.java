package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class insert {
	public static void main(String[] args) {
		
		ApplicationContext context= new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
		
	JdbcTemplate jdbcTemplate=	context.getBean(JdbcTemplate.class);
	
	int studentId =3;
	String studentName = "Ashish Nishad ";
	int studentAge=244;
	String studentGender="Male";
	String studentAddress="JAunpur";
	
	
	String Query="INSERT INTO students VALUES(?,?,?,?,?)";
	
int count=	jdbcTemplate.update(Query,studentId,studentName,studentAge,studentGender,studentAddress);

if(count >0) {
	System.out.println("INSERT SUCCESSFULLY");
	
}
else {
	System.out.println("NOT INSERTED DUE TO SOME INTERNL PROBLEM");
}
		
	}

}
