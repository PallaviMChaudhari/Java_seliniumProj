package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {
  @Test(groups = "smoke")
  public void a() {
	  Reporter.log("A is running", true);
  }
  @Test
  public void b() {
	  Reporter.log("B is running", true);
  }
  @Test(groups = "smoke")
  public void c() {
	  Reporter.log("C is running", true);
  }
  @Test(groups = "regression")
  public void d() {
	  Reporter.log("D is running", true);
  }
  @Test(groups = "smoke")
  public void e() {
	  Reporter.log("E is running", true);
  }
}
