package TestNG;

import org.testng.annotations.Test;

public class priority2 {
	@Test
	public void h() {
		  System.out.println("hema");
	  }
		  @Test(priority=0)
		  public void m() {
			  System.out.println("Mohana");
		  } 
		  @Test
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
			  System.out.println("yazhini");
		  }
		  //first it will compare then it will execute
}
