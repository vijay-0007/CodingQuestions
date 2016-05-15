
public class MatricChainMulti {

	
	public static void main(String[] args) {
		
		int arr[]={10,20,30};
		
		System.out.println(getMin(arr,arr.length));
		
	}

	private static int getMin(int[] arr, int length) {

	if(length<=2)
		return 0 ;
	
	int dp[][]=new int[length-1][length-1];
		
	
	for(int l=2 ; l < length; l++){
		
		
		for(int j=0; j <length-l ;j++){
			
				int k=j+l-1;
			
				dp[j][k]=Integer.MAX_VALUE;
			
				for(int m=j ;m<k;m++){
					
					int number=dp[j][m]+dp[m+1][k]+arr[j]*arr[m]*arr[k+1];
					if(number < dp[j][k])
						dp[j][k]=number;
				}		
		  }	
	}
	
	for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp.length; j++) {
				System.out.print(dp[i][j]+"  ");
			}
			System.out.println();
	}
	
	
		return dp[0][length-2] ;
	}
	
	
}
