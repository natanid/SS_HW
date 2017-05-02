package com.softserve.edu.hw23my;
/*
 Написати абстрактний клас (Employee), який наслідує створений інтерфейс (Worker).
 В класі створити поля для збереження імені (name), віку (age), трудового стажу (seniority) та відпрацьованих годин (hours).
 Поля заповнювати за допомогою конструктора,
 вік та стаж перевіряти на коректність. Інших конструкторів та set-ів не створювати.
 Реалізувати public методи getName(), getAge() i getSeniority() та protected метод getHours().
 Метод getPayment() залишити абстрактним.
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
