package testNG_Learning;

import org.testng.annotations.Test;

public class HowToSetEnabled {
	
	//Enabled means the test case is ready for execution
	
	//Default Enabled is true , because of that we are able to run all the test cases
	
	//If Enabled is false those corresponding test case will not run
	
	
	@Test(priority=0,enabled = true)
	public void apple()
	{
		System.out.println("This is Apple Phone");
	}
	
	@Test(priority=-3,enabled = true)
	public void apple2()
	{
		System.out.println("This is also Apple Phone");
	}
	
	@Test(priority=-7)
	public void vivo1() {
		System.out.println("This is Vivo phone");
	}
	
	@Test(priority=-9)
	public void vivo2() {
		
	System.out.println("This is also Vivo phone");

	}
	@Test(priority=-10)
	public void moto1() {
		System.out.println("This is Moto phone");
	}
	
	@Test(priority=-11)
	public void moto2() {
		
	System.out.println("This is also Moto phone");

	}
	
	@Test(priority=0)
	public void Oppo()
	{
		System.out.println("This is Oppo Phone");
	}
		
		@Test(priority=1)
		public void Oppo1()
		{
			System.out.println("This is also Oppo Phone");
		}
	

}
