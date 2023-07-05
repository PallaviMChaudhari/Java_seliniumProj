package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGKeywords {
  @Test(enabled = false)
  public void a() {
	  Reporter.log("method A", true);
  }
  @Test(timeOut = 1000)
  public void b() {
	  //Thread.sleep(3000);
	  Reporter.log("method B", true);
  }
  @Test(invocationCount = 3)
  public void c() {
	  Reporter.log("method C", true);
  }
  @Test
  public void d() {
	  Reporter.log("method D", true);
  }
}
