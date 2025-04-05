package com.example.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.AppConfig2;
import com.example.entity.Car12;
public class MainApp2 {

	public MainApp2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig2.class);

Car12 car=context.getBean(Car12.class);
car.startCar();
	}

}
