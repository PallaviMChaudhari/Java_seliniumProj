package testNGSoftAssert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class A {
	SoftAssert s=new SoftAssert();
  @Test
  public void a() {
	  String str1="pallavi";
	  String str2="pallavi";
	  String str3="riddhi";
	  String str4=null;
	
	  Reporter.log("Ais running..",true);
	  Assert.assertEquals(str1, str2,"TC is Fail bcoz string not match");
	  Assert.assertEquals(str1, str3,"TC is Fail bcoz string not match");
	  Assert.assertNotEquals(str3, str2,"TC is Fail bcoz string not match");
	  Assert.assertNotNull(str4);
	  s.assertAll();
  }
  @Test
  public void b() {
	  String str1="pallavi";
	  String str2="pallavi";
	  String str3="riddhi";
	  
	  Reporter.log("B is running..",true);
	  Assert.assertNotEquals(str3, str2,"TC is Fail bcoz string not match");
	  Assert.assertEquals(str1,str2,"TC is Fail bcoz string not match");
	  s.assertAll();
  }
  
 
  
}
