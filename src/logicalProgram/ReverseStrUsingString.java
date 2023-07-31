package logicalProgram;

import java.util.Scanner;

public class ReverseStrUsingString {

	public static void main(String[] args) {
		int orgNum,revNum;
		String orgStr,revStr="";
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter num :");
		orgNum=sc.nextInt();
		
		orgStr=Integer.toString(orgNum);
		
		for(int i=orgStr.length()-1;i>=0;i--) {
			revStr=revStr+orgStr.charAt(i);
		}
		
		System.out.println("revstr is :"+revStr);
		
		revNum=Integer.parseInt(revStr);
		System.out.println("reverse Num :"+revNum);
		
		sc.close();
	}

}
