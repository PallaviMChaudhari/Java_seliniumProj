package logicalProgram;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		String revStr="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur string :");
		String orgStr = sc.next();
		
		for(int i=orgStr.length()-1;i>=0;i--){
			revStr=revStr+orgStr.charAt(i);
			
		}
		
		if(revStr.equalsIgnoreCase(orgStr)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("string is not palindrome");
		}
		sc.close();

	}

}
