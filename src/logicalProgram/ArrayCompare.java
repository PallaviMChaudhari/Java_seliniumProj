package logicalProgram;
import java.util.Arrays;

public class ArrayCompare {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {3,4,5,6,7};
		int c[]= {1,2,3,4,5};
		
		System.out.println("compare a & b :"+Arrays.equals(a, b));
		
		System.out.println("compare a & c :"+Arrays.equals(a,c));

	}

}
