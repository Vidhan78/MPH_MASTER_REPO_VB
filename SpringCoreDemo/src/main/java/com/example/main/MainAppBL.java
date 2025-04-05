package com.example.main;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.config.AppConfigBL;
import com.example.entity.CarBL;
public class MainAppBL {

	public MainAppBL() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfigBL.class);
		
		
		CarBL car=context.getBean(CarBL.class);
		car.startCar();
		
		context.close();
	}

}
