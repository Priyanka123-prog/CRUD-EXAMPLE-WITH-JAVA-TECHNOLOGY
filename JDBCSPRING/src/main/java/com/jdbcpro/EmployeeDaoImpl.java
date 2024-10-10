package com.jdbcpro;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDaoImpl implements EmployeeDao{

	private JdbcTemplate jTemplate;
	
	
	public JdbcTemplate getjTemplate() {
		return jTemplate;
	}


	public void setjTemplate(JdbcTemplate jTemplate) {
		this.jTemplate = jTemplate;
	}


	@Override
	public int insert(Employee e) {
		 String q="insert into Employee (id,name,city) values(?,?,?)";
	     int r=this.jTemplate.update(q,e.getId(),e.getName(),e.getCity());
	     return r;
	}


	@Override
	public int change(Employee e) {
		String q="update Employee set name=? ,city=? where id=?";
	     int r=this.jTemplate.update(q,e.getName(),e.getCity(),e.getId());
	     return r;
	}


	@Override
	public int delete(int id) {
		String q="delete from Employee where id=?";
	     int r=this.jTemplate.update(q,id);
	     return r;
	}


	@Override
	public Employee getEmployee(int id) {
		String q="select * from Employee where id=?";
		RowMapper<Employee> rowMapper=new RowMapperImpl();
		Employee e=this.jTemplate.queryForObject(q, rowMapper,id);
		return e;
	}


	@Override
	public List<Employee> getAllEmployee() {
		String q="select * from Employee";
		RowMapper<Employee> rowMapper=new RowMapperImpl();
		List<Employee> emps=this.jTemplate.query(q, rowMapper);
		return emps;
	}
	

}
