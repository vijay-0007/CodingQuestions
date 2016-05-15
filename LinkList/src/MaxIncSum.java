
public class MaxIncSum {

	public static void main(String[] args) {

		int arr[]={-12,-12};
		System.out.println(maxSum(arr));
	}

	private  static int maxSum(int[] arr) {
		
		int currMax=0 ;
		int overAllMax=0;
		
		for(int i=0 ; i < arr.length ; i++){
			
			if(arr[i]+currMax>0){
				currMax=currMax+arr[i];
				if(currMax > overAllMax)
					overAllMax=currMax;
			}else{
				currMax=0 ;
			}
		}
		
		return overAllMax;
	}
	
}
