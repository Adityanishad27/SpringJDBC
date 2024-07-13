package com.springjdbc.Read;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Read_Select_Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context= new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
	    JdbcTemplate jdbcTemplate=	context.getBean(JdbcTemplate.class);
	    
	    int studentId=2;
	    	
	    String Query="select * from students where studentId=?";
	    
	   List<students> studentlist= jdbcTemplate.query(Query, new studentRowMapper(),studentId);	
	   
	   for(students list : studentlist) {
		   System.out.println("studentId :"+list.getStudentId());
		   System.out.println("studentName :"+list.getStudentName());
		   System.out.println("studentAge :"+list.getStudentAge());
		   System.out.println("studentGender :"+list.getStudentGender());
		   System.out.println("studentAddress :"+list.getStudentAddress());

	}
	}

}
