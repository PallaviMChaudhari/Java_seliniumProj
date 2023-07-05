package testNGStudy;

//import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnKeyword {
  @Test(dependsOnMethods = {"c","d"})
  public void a() {
	  Reporter.log("a is running", true);
  }
  @Test(priority = -10)
  public void b() {
	  Reporter.log("b is running", true);
  }
  @Test
  public void c() {
	  Reporter.log("c is running", true);
  }
  @Test
  public void d() {
	  
	  Reporter.log("d is running", true);
  }
}
