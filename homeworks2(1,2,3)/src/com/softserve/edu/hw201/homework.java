package com.softserve.edu.hw201;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class homework {
	 /* HW2: task# 1. ��������� � ��������� �����. ������ ������� �����, �� ������� � ����� �����.
   ���������, ���������� 56787 �������� 2.
   ���������� �������� � ����� main, ����� ����� ������ ������� */
    
	public static void main (String[] args) throws java.lang.Exception
    {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Please enter number : ");
    String number = null;
    int sevenOccurrence = 0;
    try {
    number = reader.readLine();
    for(int i = 0, n = number.length() ; i < n ; i++) {
    char c = number.charAt(i);
    if(c == '7') {
    sevenOccurrence++;
    }
    }
    } catch (IOException e) {
    e.printStackTrace();
    }
    System.out.println("You entered : " + number);
    System.out.println("7 occurrences: " + sevenOccurrence);
     
    }
    }

