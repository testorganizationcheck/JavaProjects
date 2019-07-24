package weekone;

import java.io.IOException;

public class CopyExcelData {

	public static void main(String[] args) throws IOException  {		
		String let="LIBERTY TESTING CENTER";
		let.toLowerCase();
		int len =let.length();
		System.out.println(len);
		char[] ab =let.toCharArray();
	    for(int i=len-1;i>=0;i--){
	    	if(i==len-1){
	    	char a=	ab[i];
	    	System.out.print(Character.toUpperCase(a));	
	    	}else if(i!=0 && ab[i+1]==' '){	    	
	    	System.out.print(Character.toUpperCase(ab[i]));
	        }else{
	        System.out.print(Character.toLowerCase(ab[i]));	
	        }
	    	
	    	}
		
	
	}
}
