package com.jdbcpro;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/jdbcpro/beans.xml");
		EmployeeDao ed=(EmployeeDao)context.getBean("ed");
		//insert
		/*Employee e1=new Employee();
		e1.setId(103);
		e1.setName("reva");
		e1.setCity("nashik");
		
		int r=ed.insert(e1);
		System.out.println(r+" row affected");*/
		
		//update
		/*Employee e1=new Employee();
		e1.setId(101);
		e1.setName("geeta");
		e1.setCity("nashik");
		int r=ed.change(e1);
		System.out.println(r+" row affected");*/
		
		//delete
		/*int r=ed.delete(101);
		System.out.println(r+" record deleted successfully");*/
		
		//get single data
		/*Employee e=ed.getEmployee(103);
		System.out.println(e);*/
		
		//get all data
		List<Employee> all=ed.getAllEmployee();
		for(Employee e:all) {
			System.out.println(e);
			
		}

	}

}
