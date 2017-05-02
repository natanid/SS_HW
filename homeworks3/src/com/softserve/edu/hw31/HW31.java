package com.softserve.edu.hw31;

import java.util.Arrays;
import java.util.Scanner;

/* HW3 task # 1. Прочитати з клавіатури масив дійсних чисел. 
 * Поміняти місцями максимальне та мінімальне число.
 * Результат вивести на екран.
 * */
public class HW31 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your real number array: ");
		String string = null;
		if (scanner.hasNextLine()) {
			string = scanner.nextLine();
		}
		String[] arrayString = string.split(" ");
		float[] arrayFloat = new float[arrayString.length];
		for (int i = 0; i < arrayString.length; i++) {
			arrayFloat[i] = new Float(arrayString[i]);

		}
		int indexOfMax = 0;
		float max = 0;
		for (int i = 0; i < arrayFloat.length; i++) {
			if (arrayFloat[i] > max) {
				max = arrayFloat[i];
				indexOfMax = i;
			}
		}
		int indexOfMin = 0;
		float min = max;
		for (int i = 0; i < arrayFloat.length; i++) {
			if (arrayFloat[i] < min) {
				min = arrayFloat[i];
				indexOfMin = i;
			}
		}

		arrayFloat[indexOfMax] = min;
		arrayFloat[indexOfMin] = max;
		
		System.out.println("Result:");
		
		System.out.println(Arrays.toString(arrayFloat));
	}
}