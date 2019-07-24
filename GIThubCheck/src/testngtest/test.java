package testngtest;

public class test {

	public static void main(String[] args) {
		
		for(int i=5;i>0;i--){	
			int a =5;
			if(a!=i){
				int c=a-i;
				for(int j =c;j>0;j--){				
			     System.out.print(" ");
				}
			}
			
			for(int num1=i;num1>0;num1--){
			
				System.out.print(num1);
				
			}		
			
			for(int num2=2;num2<=i;num2++)	{
				System.out.print(num2);
			}			
			
			System.out.println();
			
		}
		

	}

}
