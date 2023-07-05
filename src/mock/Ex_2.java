package mock;

public class Ex_2 {

	public static void main(String[] args) {
		//     *
		//    **
		//   ***
		//  ****
		// *****
		
		int star=1;
		int space=4;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=star;k++){
				System.out.print("*");
				
			}
			System.out.println();
			star++;
			space--;
		}
		
		System.out.println("=========================");
		
		//*****
		// ****
		//  ***
		//   **
		//    *
		
		int star1=5;
		int space1=0;
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=space1;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star1;k++) {
				System.out.print("*");
			}
			System.out.println();
			star1--;
			space1++;
		}

	}

}
