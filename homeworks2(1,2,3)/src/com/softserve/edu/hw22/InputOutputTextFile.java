package com.softserve.edu.hw22;


import java.util.Scanner;

public class InputOutputTextFile {
	/*
	 * 2. ��������� � ��������� �����. ������ ������� ����� ����� �� �����
	 * ��������. ���������, ���������� 4004 �������� 4004=2*2*7*11*13.
	 * ���������� �������� � ����� main, ����� ����� ������ �������.
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