package weekone;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int n = 1234;
		String a = "jdfds";
		StringBuffer str = new StringBuffer(Integer.toString(n));
		StringBuilder build = new StringBuilder(a);
		System.out.println(build.reverse());
		System.out.println(str.reverse());

	}

}
