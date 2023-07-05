package testNGStudy;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Test1 {
  @Test
  public void a() {
	  Assert.fail();
	  Reporter.log("A is running", true);
  }
  @Test
  public void b() {
	  
	  Reporter.log("B is running", true);
  }
  @Test
  public void c() {
	  Reporter.log("C is running", true);
  }
  @Test
  public void d() {
	 
	  Reporter.log("D is running", true);
  }
  @Test
  public void e() {
	  Reporter.log("E is running", true);
  }
}
