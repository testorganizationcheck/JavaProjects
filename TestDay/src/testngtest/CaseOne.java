package testngtest;

import org.testng.annotations.Test;

public class CaseOne {
	@Test(groups={"smoke","regression"})
	public void method1(){
		System.out.println("Print Method1");		
	}
	@Test(groups={"smoke","functional"})
	public void method2(){
		System.out.println("Print Method2");		
	}
	@Test(groups={"regression"})
	public void method3(){
		System.out.println("Print Method3");		
	}
	@Test(groups={"functional"})
	public void method4(){
		System.out.println("Print Method4");		
	}

}
