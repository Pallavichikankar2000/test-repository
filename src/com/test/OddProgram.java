package com.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OddProgram {

	public static void main(String[] args) {
		boolean no,b;
		BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the value of no");
		no=boolean.parseboolean(ob.readLine());
		b=(no%2==0);

		System.out.println(b);
	}

}
