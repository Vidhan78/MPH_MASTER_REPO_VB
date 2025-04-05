package com.example.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Employee;
@Repository
public class EmployeeDaotrimp1 implements EmployeeDAOTrx {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int save(Employee emp) {
		String sql="INSERT INTO emp(empname,salary) VALUES(?,?)";
		return jdbcTemplate.update(sql,emp.getName(),emp.getSalary());
		
	}
	@Override
	public int update(Employee emp) {
		String sql="UPDATE emp Set empname=?,salary=? where empid=?";
		return jdbcTemplate.update(sql,emp.getName(),emp.getSalary(),emp.getId());
	}
	@Override
	public int delete(int id) {
		String sql="Delete from emp  where empid=?";
		return jdbcTemplate.update(sql,id);
	}
	@Transactional
	public void saveEmployeeWithTransaction(Employee emp1,Employee emp2)
	{
		String sql="Insert into emp(empname,salary) values(?,?)";
		jdbcTemplate.update(sql,emp1.getName(),emp1.getSalary());
	
	
	//int error=1/0;
	jdbcTemplate.update(sql,emp2.getName(),emp2.getSalary());
	}
}