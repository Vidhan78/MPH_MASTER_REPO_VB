package com.example.dao;
import com.example.entity.*;
public interface EmployeeDAOTrx {
int save(Employee emp);
int update(Employee emp);
int delete (int id);
	void saveEmployeeWithTransaction(Employee emp1,Employee emp2);
}
