package com.softserve.edu.hw23my;

public class SeniorEmployee extends Employee {

	public SeniorEmployee(String name, int age, int seniority, int hours) {
		super(name, age, seniority, hours);
	}

	public double getPayment() {
		System.out.println("For Senior");
		return getHours() * (3 + getSeniority() / 10 + getAge() / 20);
	}

}
