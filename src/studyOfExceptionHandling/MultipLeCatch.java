package studyOfExceptionHandling;

public class MultipLeCatch {

	public static void main(String[] args) {
		String a="Pallavi";
		//String b=null;
		
		try {
			a.charAt(7);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("plz enter valid index within 0 to 6");
		}
		catch (NullPointerException e) {
			System.out.println("their is some problem String is null");
		}
		
		
		

	}

}
