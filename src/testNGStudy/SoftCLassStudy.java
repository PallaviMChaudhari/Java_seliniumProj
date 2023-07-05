package testNGStudy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftCLassStudy {
  @Test
  public void f() {
	  String a="pallavi";
	  String b="pallavi";
	  String c=null;
	  
	  Assert.assertEquals(a,b,"TC Fail Bcoz String not match");
	  
	  Assert.assertNotNull(c);
	 
	 
  }
}
