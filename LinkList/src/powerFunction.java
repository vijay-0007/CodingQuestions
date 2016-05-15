
public class powerFunction {

	
	public static void main(String[] args) {
		
		int a = 5 ; 
		int b = 100; 
		 System.out.println(power(a,b));	
	}

	private static int power(int a, int b) {

		if(b==0)
			return 1 ;
		
		int  x=power(a, b/2);
		
		if(b%2==0)
			return x*x;
		else
			return 
				a*x*x;	
	}
}
