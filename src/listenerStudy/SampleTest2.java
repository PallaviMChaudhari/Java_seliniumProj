package listenerStudy;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listenerStudy.Listener.class)
public class SampleTest2 {
  @Test
  public void TC5() {
	  Reporter.log("TC5 is running", true);
  }
  @Test(timeOut = 500)
  public void TC6() throws InterruptedException {
	  Thread.sleep(1000);
	  Reporter.log("TC6 is running", true);
  }
  @Test(dependsOnMethods = "TC6")
  public void TC7() {
	  Reporter.log("TC7 is running ", true);
  }
  @Test(priority = -1)
  public void TC8() {
	  Reporter.log("TC8 is running ", true);
  }
}
