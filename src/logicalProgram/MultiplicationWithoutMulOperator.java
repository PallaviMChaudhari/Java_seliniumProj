package logicalProgram;

import java.util.Scanner;

public class MultiplicationWithoutMulOperator {

	public static void main(String[] args) {
		int mul=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("plz enter num1 :");
		int num1 = sc.nextInt();
		
		System.out.println("plz enter num2 :");
		int num2 = sc.nextInt();
		
		for(int i=1;i<=num2;i++) {
			mul=mul+num1;
			
		}
		System.out.println("multiplication :"+mul);
		
		sc.close();

	}

}
