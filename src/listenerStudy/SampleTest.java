package listenerStudy;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listenerStudy.Listener.class)
public class SampleTest {
  @Test
  public void TC1() {
	  Reporter.log("TC1 is running", true);
  }
  @Test(timeOut = 500)
  public void TC2() throws InterruptedException {
	  Thread.sleep(1000);
	  Reporter.log("TC2 is running", true);
  }
  @Test(dependsOnMethods = "TC2")
  public void TC3() {
	  Reporter.log("TC3 is running ", true);
  }
  @Test(priority = -1)
  public void TC4() {
	  Reporter.log("TC4 is running ", true);
  }
}
