package com.example.config;
import com.example.entity.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig2 {

	public AppConfig2() {
		// TODO Auto-generated constructor stub
	}
	public Engine12 engine() {
		return new Engine12("Mahindra Disel Engine");
	}
	public Car12 car() {
		return new Car12(engine());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
