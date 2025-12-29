package TestNG;

import org.testng.annotations.Test;
@Test(groups = {"classlvl"})
public class classgroups {
  @Test(groups = {"somke","sanity"})
  public void f1() {
	  System.out.println("hi i am somke and sanity");
  }
  @Test
  public void f2() {
	  System.out.println("i am sanity");
  }
  @Test(groups = {"regression"})
  public void f3() {
	  System.out.println("i am regression");
  }
  @Test(groups = {"retest","regression"})
  public void f4() {
	  System.out.println("i am retest and regression");
  }
}
