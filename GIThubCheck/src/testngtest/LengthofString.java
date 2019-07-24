package testngtest;

import javax.swing.text.AttributeSet.CharacterAttribute;

public class LengthofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Arup bhaii";
		int len=s.length();
		int count =0;
		for(int i=len-1;i>=0;i--){			
			if(s.charAt(i) !=' '){
				 count = count+1;
			}else{
				break;
			}
		}
		System.out.println(count);
		
	}

}
