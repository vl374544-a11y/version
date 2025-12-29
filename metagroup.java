package TestNG;

import org.testng.annotations.Test;

public class metagroup {
  @Test(groups = {"smoke"})
  public void f1() {
	  System.out.println("check core functionality of build");
  }
  @Test(groups = {"sanity"})
  public void f2() {
	  System.out.println("check basic functionality of build");
  }
  @Test(groups = {"retest"})
  public void f3() {
	  System.out.println("execute same testcase again after bug fixed");
  }
  @Test(groups = {"regression"})
  public void f4() {
	  System.out.println("check other funcationality or broken due to changes");
  }
  
}
