package studyOfExceptionHandling;

public class StudyOfTryCatch {
    int  a=19;
    int b=0;
	int c;

	public static void main(String[] args) {
		StudyOfTryCatch m=new StudyOfTryCatch(); 
		try {
			m.c=m.a/m.b;
		} catch (ArithmeticException e) {
			System.out.println("mathematics rule is violated..");
		}
	
		System.out.println("value of c :"+m.c);
		
	}

}
