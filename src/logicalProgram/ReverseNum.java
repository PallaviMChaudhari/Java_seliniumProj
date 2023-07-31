package logicalProgram;

public class ReverseNum {

	public static void main(String[] args) {
		int orgNum=12345,revNum=0;
		
		for(int i=orgNum;i>=1;i=i/10) {
			revNum=revNum*10+(i%10);
		}
		System.out.println("revesr num :"+revNum);
		
	}

}
