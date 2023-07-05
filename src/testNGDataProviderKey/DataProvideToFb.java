package testNGDataProviderKey;

import org.testng.annotations.DataProvider;

public class DataProvideToFb {
	@DataProvider(name="FbData")
	
	public static String[][] dataProvide() {
		String a[][]= {{"pallavi"},{"Ruchira"},{"vishal"}};
		return a;
	}
}
