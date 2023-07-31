package logicalProgram;

import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num :");
		int num = sc.nextInt();
		
		for(int i=num;i>=1;i--){
			fact=fact*i;
		}
		System.out.println("factorial of num is :"+fact);
		sc.close();
	}

}
