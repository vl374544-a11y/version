package TestNG;

import org.testng.annotations.Test;

public class groups {
  @Test(groups = {"smoke","sanity"})
  public void f1() {
	  System.out.println("i am a smoke and sanity ");
  }
  @Test(groups = {"sanity"})
  public void f2() {
	  System.out.println("i am sanity");
  }
  @Test(groups = {"regression"})
  public void f3() {
	  System.out.println("i am regression");
  }
  @Test(groups= {"retest","regression"})
  public void f4() {
	  System.out.println("retest and regression");
  }
}
