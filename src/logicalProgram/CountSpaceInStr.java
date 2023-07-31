package logicalProgram;



public class CountSpaceInStr {

	public static void main(String[] args) {
		int count=0;
		String str="my name is pallavi chaudhari ";
		for(int i=0;i<=str.length()-1;i++) {
			char place=str.charAt(i);
			if(place==' ') {
				count++;	
			}
		}
	
		System.out.println("num of spaces is :"+count);
		
	}

}
