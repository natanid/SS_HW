package com.softserve.edu.hw21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int i = 0;
		int j = 0;
		BufferedReader br;
		System.out.print("enter i:");
		br = new BufferedReader(new InputStreamReader(System.in));
		i = Integer.parseInt(br.readLine());
		System.out.println("Read i= " + i);
		i = Math.abs(i);
		while (i > 0) {
			if (i % 10 == 7) {
				j = j + 1;
			}
			i = i / 10;
			System.out.println("bingo " + i);
		}
		System.out.println("count = " + j);
	}
}

