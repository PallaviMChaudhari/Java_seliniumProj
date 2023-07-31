package logicalProgram;

import java.util.Scanner;

public class ArmStrongNum {

	public static void main(String[] args) {
		//371=3^3+7^3+1^3=371
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num :");
		int num = sc.nextInt();
		
		int sum=0;
		for(int i=num;i>=1;i=i/10) {
			int rem = i%10;
			sum=sum+(rem*rem*rem);
			
		}
		if(sum==num) { 
			
			System.out.println("number is armstrong ");
		}
		else {
			System.out.println("number is not armstrong");
		}
		sc.close();
	}

}
