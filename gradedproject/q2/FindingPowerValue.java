package com.gradedproject.q2;
import java.util.Scanner;
public class FindingPowerValue {
public static int power(int a, int n) {
		
		if(n==0) {
			return 1;
		}
		int result = a*power(a, n-1);
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// importing 
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter the base number X : ");
				int baseNumber = sc.nextInt();
				System.out.println("Enter the power N : ");
				int power = sc.nextInt();
				
				System.out.println(power(baseNumber, power));
				
				sc.close();

	}

}
