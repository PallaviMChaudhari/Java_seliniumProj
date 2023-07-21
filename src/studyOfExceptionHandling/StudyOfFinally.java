package studyOfExceptionHandling;

public class StudyOfFinally {

	public static void main(String[] args) {
		String a="pallavi";
		//String b=null;
		int x=10,y=0,z=0;
		
		try {
			z=x/y;
			//b.charAt(7);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Plz enter valid index within 0 to 6");
		}
		catch (NullPointerException e) {
			System.out.println("String is null");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println(a.length());
		}
		System.out.println(z);

	}

}
