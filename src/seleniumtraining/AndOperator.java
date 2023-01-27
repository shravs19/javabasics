package seleniumtraining;

public class AndOperator {

	public AndOperator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9;
		int b = 6;

		System.out.println("Demonstrating & operator\n");
		int c = a & b;
		System.out.println(a + " & " + b + " = " + c);
		
		System.out.println("Demonstrating | operator\n");
		 c = a | b;
		System.out.println(a + " | " + b + " = " + c);
		
		System.out.println("Demonstrating ! operator\n");
		 boolean p = false;
		 System.out.println(p);
		 System.out.println(!p);
				
	}
}