package sample;

import java.util.Scanner;

public class ScannerClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("Eligible for license");
		}
		else
		{
			System.out.println("Not Eligible for license");
		}

	}

}
