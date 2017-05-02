package com.softserve.edu.hw23my;

/* Написати два класи JuniorEmployee та SeniorEmployee які наслідують Employee.
 В класах реалізувати конструктор з викликом конструктора батьківського класу.
 В кожному з класів реалізувати метод getPayment() по своєму алгоритму (на власний розсуд).
 При розрахунку в методі getPayment() врахувати стаж та відпрацьовані години (звертатися через методи getAge() та getHours()).
*/

public class JuniorEmployee extends Employee {

	public JuniorEmployee(String name, int age, int seniority, int hours) {
		super(name, age, seniority, hours);
	}

	public double getPayment() {
		System.out.println("For Junior");
		return getHours() * (1 + getSeniority() / 10 + getAge() / 20);

	}
	
}
