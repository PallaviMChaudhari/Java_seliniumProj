package study_POMForDribble;

import org.testng.annotations.DataProvider;

public class DataProvide {
	@DataProvider(name="dribbleData")
	
	public String[][] readData(){
		String data[][]= {{"Pallavi_Chaudhari","Pallu@12345","pallavi"}};
		return data;
	}
	

}
