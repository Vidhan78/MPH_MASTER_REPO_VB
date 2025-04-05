package com.example.main;
import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.JdbcConfigTix;
import com.example.dao.EmployeeDAOTrx;
import com.example.entity.Employee;
public class MainAppTrx {

	public MainAppTrx() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfigTix.class);
	EmployeeDAOTrx employeeDAO=context.getBean(EmployeeDAOTrx.class);
     Employee emp1=new Employee("Vidhan Bhasme",90000000);
     Employee emp2=new Employee("Jay",90000000);
     try {
    	 employeeDAO.saveEmployeeWithTransaction(emp1, emp2);
     }catch(Exception e) {
    	 System.out.println("Transaction rolled back due to "+e.getMessage());
     }
	}

}
