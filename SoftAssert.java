package TestNG;

import org.testng.annotations.Test;

public class SoftAssert {
  @Test
  public void f() {
	  System.out.println("beginning");
	  org.testng.asserts.SoftAssert so = new  org.testng.asserts.SoftAssert();
	  so.assertEquals(10,5);
	  System.out.println("ending");
	  so.assertAll();
  }
  
  
}
