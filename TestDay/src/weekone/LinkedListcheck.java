package weekone;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class LinkedListcheck {

	public static void main(String[] args) {		
	String input = new String("google");
	int len =input.length();	
	List<Object> set = new LinkedList<Object>();
	for(int i =0 ; i<len;i++){		
	set.add(input.charAt(i));
	}	
	System.out.println(set.hashCode());
	set.add(' ');
	set.add("34534");
	set.add(3,'t');
	set.add(3);
	set.remove(set);
	System.out.println(set);
	if(set.contains(3)==true)
	{
		System.out.println("yes");
	}
	Set<Object> set1=new HashSet<Object>(set);
	set1.add(5);
	int a=set1.size();
	System.out.println(set1);
	
	/*System.out.println(set);
	System.out.println(set.hashCode());
	for(Object unique:set){
		int count =0;
		//System.out.println(unique);
		for(int j=0;j<len-1;j++){
			if(unique.equals(set.get(j))){
				count++;
			}
		}
		if(count<2){
		System.out.println(unique);
		}
	}*/	
	}
}
