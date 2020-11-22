package testNG_Learning;

import org.testng.annotations.Test;

public class ToSetPriority {
	
	@Test(priority=0)
	public void apple()
	{
		System.out.println("This is Apple Phone");
	}
	
	@Test(dependsOnMethods="apple")
	public void apple2()
	{
		System.out.println("This is also Apple Phone");
	}
	
	@Test(enabled=true)
	public void vivo1() {
		System.out.println("This is Vivo phone");
	}
	
	@Test(dependsOnMethods="vivo1")
	public void vivo2() {
		
	System.out.println("This is also Vivo phone");

	}
	@Test(priority=1)
	public void moto1() {
		System.out.println("This is Moto phone");
	}
	
	@Test()
	public void moto2() {
		
	System.out.println("This is also Moto phone");

	}
	
	@Test(priority=2)
	public void Oppo()
	{
		System.out.println("This is Oppo Phone");
	}
		
		@Test(dependsOnMethods="Oppo")
		public void Oppo1()
		{
			System.out.println("This is also Oppo Phone");
		}

}
