package weekone;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 10;
int a = 0,b = 1,sum = 0;

for(int i =0;i<num;i++){
	System.out.println(a);
	sum = a+b;
	a = b;
	b = sum;
}
	}

}
