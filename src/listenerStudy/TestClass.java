package listenerStudy;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listenerStudy.Listener1.class)
public class TestClass {
  @Test
  public void TC1() {
	  Reporter.log("Tc1 is running", true);
  }
  @Test(dependsOnMethods = "TC4")
  public void TC2() {
	  Reporter.log("Tc2 is running", true);
  }
  @Test(priority = -1)
  public void TC3() {
	  Reporter.log("Tc3 is running", true);
  }
  @Test(timeOut = 500)
  public void TC4() throws InterruptedException {
	  Thread.sleep(1000);
	  Reporter.log("Tc4 is running", true);
  }
}
