package logicalProgram;

public class ReverseStrEvenOrOddPlace {
	
	public static void main(String[] args) {
		String str="my name is pallavi";
		
		String a[] = str.split(" ");
		
		for(int i=0;i<=a.length-1;i++) {
			if(i%2==1) {
				String temp=a[i];
				a[i]=revString(temp);
				
			}
			
		}
		
		for(int i=0;i<=a.length-1;i++) {
			System.out.print(a[i]+" ");

		}
		
	}
	
	public static String revString(String input) {
		String revStr="";

		for(int i=input.length()-1;i>=0;i--) {
		   revStr=revStr+input.charAt(i);
		}
		return revStr;
	}

}
