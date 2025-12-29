package TestNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {
//  @Test
//  @Parameters({"food"})
//  public void values(String e) {
//	  System.out.println("my favourite food is = "+ e);
//	 }
	//xml should give value
	
	
	
//	@Test
//  @Parameters({"food"})
//  public void values(@Optiona String e) {
//	  System.out.println("my favourite food is = "+ e);
//	 }
	// xml should not give any thing -NULL
	
	
	@Test
	  @Parameters({"food"})
	  public void values(@Optional("curd rice") String e) {
		  System.out.println("my favourite food is = "+ e);
		 }
	//xml should not give any thing - curd rice
	
	//when you passed para(name,value) in xml and also declared curd rice , priority go to para
}
