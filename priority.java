package TestNG;

import org.testng.annotations.Test;

public class priority {
  @Test(priority=2)
  public void o() {
	  System.out.println("omana");
  }
	  @Test(priority=0)
	  public void m() {
		  System.out.println("Mohana");
	  } 
	  @Test(priority=-2)
	  public void s() {
		  System.out.println("Shastika");
	  }
	  @Test(priority=1)
	  public void a() {
		  System.out.println("Avantika");
	  }
	  @Test(priority=2)
	  public void r() {
		  System.out.println("Rohith");
	  }
	  @Test(priority=-1)
	  public void y() {
		  System.out.println("Rohith");
	  }
	  //testng in accs, for controling flow use priority
	  
}
