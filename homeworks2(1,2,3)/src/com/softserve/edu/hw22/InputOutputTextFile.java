package com.softserve.edu.hw22;


import java.util.Scanner;

public class InputOutputTextFile {
	/*
	 * 2. Прочитати з клавіатури число. Знайти розклад цього числа на прості
	 * множники. Наприклад, прочитавши 4004 отримаємо 4004=2*2*7*11*13.
	 * Реалізувати алгоритм у методі main, назву класу обрати довільно.
	 */

	public static void main(String[] args) {
		InputOutputTextFile in = new InputOutputTextFile();
		Scanner sc = new Scanner(System.in);
		System.out.println("input number: ");
		int number = sc.nextInt();

		for (int i = 2; i <= number; i++) {
			for (int j = 2; j <= i; j++) {
				if (number % j == 0) {
					System.out.println(j + "");
					number = number / j;
				}

			}
		}
	}
}

/*
 * for (long i = 2; i <= Math.floor(Math.sqrt(number)); i++) { if (number % i ==
 * 0) { System.out.println(i); } }
 */