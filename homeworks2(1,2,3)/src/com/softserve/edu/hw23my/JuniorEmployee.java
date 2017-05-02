package com.softserve.edu.hw23my;

/* �������� ��� ����� JuniorEmployee �� SeniorEmployee �� ��������� Employee.
 � ������ ���������� ����������� � �������� ������������ ������������ �����.
 � ������� � ����� ���������� ����� getPayment() �� ����� ��������� (�� ������� ������).
 ��� ���������� � ����� getPayment() ��������� ���� �� ����������� ������ (���������� ����� ������ getAge() �� getHours()).
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
