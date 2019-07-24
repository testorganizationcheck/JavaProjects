package weekone;

public class Pramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=11;
		for(int i=1;i<=n/2+1;i++){
			int k =0;
			for(int j=1;j<=n/2+1-i;j++){				
				System.out.print(" ");				
			}
			while(k!=(2*i-1)){
				System.out.print("*");
				k++;
			}	
			
			System.out.println();
		}

	}

}
