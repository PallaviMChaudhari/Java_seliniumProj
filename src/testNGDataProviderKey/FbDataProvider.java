package testNGDataProviderKey;

import org.testng.annotations.DataProvider;

public class FbDataProvider {
	@DataProvider(name="dataGive")
	
	public static String[][] dataProvide(){
		String data[][]= {{"Pallavi","Chaudhari","9405888174"},{"priya","patil","9604989089"},{"kalyani","vasaikar","9970139111"}};
		return data;
	} 

}
