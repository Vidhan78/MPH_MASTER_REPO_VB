package com.example.entity;

public class Car12 {
private Engine12 engine;
	public Car12(Engine12 engine) {
		this.engine=engine;
	}

public void startCar() {
	System.out.println("CAR1 Started with engine1"+engine.getEngineType());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
