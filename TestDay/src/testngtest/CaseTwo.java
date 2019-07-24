package testngtest;

import org.testng.annotations.Test;

public class CaseTwo {
    @Test(priority=5)
	public void method6(){
		System.out.println("Print Method5");		
	}
	@Test
	public void method5(){
		System.out.println("Print Method6");		
	}
	@Test
	public void method7(){
		System.out.println("Print Method7");		
	}
	@Test
	public void method8(){
		System.out.println("Print Method8");		
	}
	
}
