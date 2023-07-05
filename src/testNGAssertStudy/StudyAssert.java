package testNGAssertStudy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StudyAssert {
  @Test
  public void test1() {
	  //equals and not equals 
	 String s1="pune";
	 //String s2="mumbai";
	 String s3="pune";
	 
	 //Assert.assertEquals(s1,s2);
	 Assert.assertEquals(s1, s3,"test case fail becoz value not match");
	  
  }
  @Test
  public void test2(){
	  String s1="pune";
	  String s2="mumbai";
	  //String s3="pune";
	  
	  Assert.assertNotEquals(s2, s1,"test case fail becoz value are same");
	  
	  
  }
	  
	  
}

