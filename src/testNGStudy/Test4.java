package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test4 {
  @Test(groups = "regression")
  public void myMethod1() {
	  Reporter.log("test1 is running", true);
  }
  @Test(groups = "smoke")
  public void myMethod2() {
	  Reporter.log("test1 is running", true);
  }
  
  @Test(groups = "regression")
  public void myMethod3() {
	  Reporter.log("test3 is running", true);
  }
  @Test(groups = "smoke")
  public void myMethod4() {
	  Reporter.log("test4 is running", true);
  }
  @Test
  public void myMethod5() {
	  Reporter.log("test5 is running", true);
  }
}
