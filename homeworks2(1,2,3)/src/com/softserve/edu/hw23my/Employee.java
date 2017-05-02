package com.softserve.edu.hw23my;
/*
 �������� ����������� ���� (Employee), ���� ������ ��������� ��������� (Worker).
 � ���� �������� ���� ��� ���������� ���� (name), ��� (age), ��������� ����� (seniority) �� ������������� ����� (hours).
 ���� ����������� �� ��������� ������������,
 �� �� ���� ��������� �� ����������. ����� ������������ �� set-�� �� ����������.
 ���������� public ������ getName(), getAge() i getSeniority() �� protected ����� getHours().
 ����� getPayment() �������� �����������.
*/
public abstract class Employee implements Comparable<Employee>, Worker
{
	String name;
	int age;
	int seniority;
	int hours;

	public Employee(String name, int age, int seniority, int hours) {
		this.name = name;
		if (age <= 18) {
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

	public int compareTo( Employee anotherObject )
    {
    	return this.name.compareTo( anotherObject.name ) ;
    }

    @Override
    public String toString()
    {
        return "[" + name + " age: " + age + "]" ;
    }
    }
