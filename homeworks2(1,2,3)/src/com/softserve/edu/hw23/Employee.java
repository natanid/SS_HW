package com.softserve.edu.hw23;

public abstract class Employee implements Worker {
	String name;
	int age;
	int seniority;
	int hours;

	public Employee(String name, int age, int seniority, int hours) {
		this.name = name;
		if (age <= 16) {
			throw new RuntimeException("Age error");
		}
		this.age = age;
		if (seniority <= 0) {
			throw new RuntimeException("Seniority error");
		}
		this.seniority = seniority;
		this.hours = hours;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getSeniority() {
		return seniority;
	}

	protected int getHours() {
		return hours;
	}

	public abstract double getPayment();
}

/*
�������� ����������� ���� (Employee), ���� ������ ��������� ��������� (Worker).

� ���� �������� ���� ��� ���������� ���� (name), ��� (age), ��������� ����� (seniority) �� ������������� ����� (hours).

���� ����������� �� ��������� ������������, �� �� ���� ��������� �� ����������. ����� ������������ �� set-�� �� ����������.
���������� public ������ getName(), getAge() i getSeniority() �� protected ����� getHours().
����� getPayment() �������� �����������.


*/