package testNGStudy;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
  @Test
  public void myMethod1() {
	  Reporter.log("test1 is running", true);
  }
  @Test
  public void myMethod2() {
	  Reporter.log("test1 is running", true);
  }
  
  @Test
  public void myMethod3() {
	  
	  
	  Reporter.log("test3 is running", true);
  }
  @Test
  public void myMethod4() {
	  Reporter.log("test4 is running", true);
  }
  @Test
  public void myMethod5() {
	  Reporter.log("test5 is running", true);
  }
}
