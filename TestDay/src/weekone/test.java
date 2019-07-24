package weekone;

import org.junit.Test;
import org.testng.annotations.AfterTest;

public class test {

	@Test
public void excelDataprovider1() {
		
	excelDataprovider(10);
	excelDataprovider(11);
		
		
	}
	
	@AfterTest
	public void excelDataprovider(int a) {
		//int b =1;
		System.out.println(a);
		
	}
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		int n =15;
		
		for(int j=1; j<=(n/2+1); j++){
			int k =0;
			for (int i=j;i<=n/2;i++){
				
				System.out.print(" ");				
			}
			
			while(k!=(j*2-1))
			{
			System.out.print("*");
			k++;
			}
			System.out.println();
	
		}
	
	}*/

}
