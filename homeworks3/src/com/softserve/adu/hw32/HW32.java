package com.softserve.adu.hw32;

import java.util.Arrays;
import java.util.Scanner;
/*2. ��������� � ��������� ����� ������.
 *  ³���������� ���� �� ��������� �� ��������� ������ Arrays.sort().
   ��������� ������� �� �����.*/

public class HW32
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your real number array: ");
		String string = null;
		if (scanner.hasNextLine())
			string = scanner.nextLine();

		String[] arrayString = string.split(" ");

		Arrays.sort( arrayString ) ;

		System.out.println("Result:" + Arrays.toString(arrayString));
	}
}
