package TestNG;

import org.testng.annotations.Test;

public class enable {
	@Test(priority=0)
	  public void m() {
		  System.out.println("Mohana");
	  } 
	  @Test
	  public void s() {
		  System.out.println("Shastika");
	  }
	  @Test(enabled=false)
	  public void a() {
		  System.out.println("Avantika");
	  }
	  @Test(priority=2)
	  public void r() {
		  System.out.println("Rohith");
	  }
	  @Test(priority=-1)
	  public void y() {
		  System.out.println("yazhini");
	  }
	  //to enable a function or enable code execution

}
