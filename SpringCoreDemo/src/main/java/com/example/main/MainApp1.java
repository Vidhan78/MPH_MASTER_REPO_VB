package com.example.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import com.example.entity.Car12;
 
public class MainApp1 {
 
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config1.xml");
		
		Car12 car = (Car12) context.getBean("carBean");
		car.startCar();
 
	}
}