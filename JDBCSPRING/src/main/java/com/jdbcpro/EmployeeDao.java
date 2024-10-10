package com.jdbcpro;
import java.util.*;
public interface EmployeeDao {
	
	public int insert(Employee e);
	public int change(Employee e);
	public int delete(int id);
	public Employee getEmployee(int id);
	public List<Employee> getAllEmployee();
	

}
