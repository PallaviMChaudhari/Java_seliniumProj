package logicalProgram;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num :");
		int num = sc.nextInt();
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count++;
				break;
			}
		}
		
		if(count==0) {
			System.out.println("number is prime");
		}
		else {
			System.out.println("number is not prime");
		}
		sc.close();
		
	}

}
