package weekone;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num= 1531;
		int quotient,cube,sum = 0;		
		Scanner num = new Scanner(System.in);
		System.out.println("Enter a 3 digit number to check whether is it armstrong?");
		int num1 = num.nextInt();
		int originalnum = num1;
		String num2=Integer.toString(num1);
		int len = num2.length();		
      if(len==3)
      {
    	while(num1!=0){
			    		quotient =num1%10;
			    		cube = quotient*quotient*quotient;
			    		sum = cube+sum;
			    		num1 =num1/10;
    	              }
    	 if(sum==originalnum)
         {
       	System.out.println("this is Armstrong NO.");  
         }	else{System.out.println("Sorry..this is not Armstrong No.");
         }       
       }else
       {
       System.err.println("Your number is not a 3 digit number");
       }     
	}

}
