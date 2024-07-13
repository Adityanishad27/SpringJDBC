package com.springjdbc.Read;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext context= new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
    JdbcTemplate jdbcTemplate=	context.getBean(JdbcTemplate.class);
    	
    String Query="select * from students";
    
   List<students> studentlist= jdbcTemplate.query(Query, new studentRowMapper());	
   
   for(students list : studentlist) {
	   System.out.println("studentId :"+list.getStudentId());
	   System.out.println("studentName :"+list.getStudentName());
	   System.out.println("studentAge :"+list.getStudentAge());
	   System.out.println("studentGender :"+list.getStudentGender());
	   System.out.println("studentAddress :"+list.getStudentAddress());
	   
   }
    	
    }
}
