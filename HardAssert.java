package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
  @Test
  public void f() {
	  System.out.println("Start");
	  Assert.assertEquals("hello","hello"); //actual,expected
	  System.out.println("finished");
  }
  @Test
  public void f1() {
	  System.out.println("Start");
	  Assert.assertNotEquals("hi","bye");
	  System.out.println("finished");
  }
  @Test
  public void f2() {
	  System.out.println("Start");
	 String b = "Balloon";
	 Assert.assertTrue(b.contains("oo"));
	  System.out.println("finished");
  }
  
  @Test
  public void f3() {
	  System.out.println("Start");
	 String b = "Balloon";
	 Assert.assertFalse(b.contains("oo"));
	  System.out.println("finished");
  }
  
  
  
  
  
  
  
  
  
  
}
