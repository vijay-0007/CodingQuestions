
public class AllSubSet {
	
	public static void main(String[] args) {
		
	char arr[]={'a','b','c'};
	
	findAllsubSet(arr);
		
	}

	private static void findAllsubSet(char[] arr) {
		
		int totalSubSet =(int) Math.pow(arr.length, 2);
		
		
		for(int i = 0 ; i < totalSubSet ; i++){

			System.out.println();
			
			for (int j = 0; j < arr.length; j++) {
				
				if((i & (1 << j )) != 0)
					System.out.print(arr[j]);
			}
		}
	}
}
