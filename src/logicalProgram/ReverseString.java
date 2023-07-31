package logicalProgram;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String revString="";
		Scanner sc= new Scanner(System.in);
		System.out.println("plz enter the string :");
		String orgString = sc.next();
		
		for(int i=orgString.length()-1;i>=0;i--) {
			revString=revString+orgString.charAt(i);
			
		}
	    System.out.println("reverse String is :"+revString);
	    
	    sc.close();
	}

}
