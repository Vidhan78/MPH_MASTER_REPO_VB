package com.example.entity;
import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import javax.annotation.*;
@Component
public class CarBL {

	public CarBL() {
		System.out.println("Car Constructor:Car is created!");
	}
	@PostConstruct
	public void init() {
		System.out.println("PostConstruct:Car is intialized!");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("PreDestroy:Car is intialised");
	}
	public void startCar() {
		System.out.println("Car is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
