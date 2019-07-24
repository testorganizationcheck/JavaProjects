package weekone;

public class Multiplysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int num =1;num<=100;num++){
			
			if(num%3==0 || num%5==0){
				sum = sum+num;
			}			
		}
		System.out.println(sum);

	}

}
