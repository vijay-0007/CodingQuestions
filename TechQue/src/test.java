
public class test {

	public static void main(String[] args) {
		
		int arr[]={2,2,1,1,1};
		
		System.out.println(calcu(arr,5));
	
		
		
	}

	private static int calcu(int[] arr, int i) {
		
		int arrsize=arr.length;
	
		if(arrsize==0 || i>arrsize || i<1)
			return -1;
		
		if(arrsize==1)
			return 1 ;
	
		
		int prepre=1;
		int pre;
		
		 if(arr[0]==2)
			 pre=1 ;
		 else
			 pre=0;
		 
		 if(arrsize==2)
			return pre;
		 
		 if(arrsize<i)
			 return -1;
		 
		 for(int j=2 ; j < i ; j++){
			 
			 int temp = pre ;
			 
			 if(arr[j-1]==3){
				 pre=1;
			 }else if(arr[j-1]==2){
				 
				 if(prepre==1 && pre==1)
					 pre=0;
				 else
					 pre=1;
			 }else if(arr[j-1]==1){
				 
				 if(pre==1 || prepre==1)
					 pre=0;
				 else
					 pre=1;
			 }else if(arr[j-1]==0){
				 pre=0;
			 }
			 prepre=temp;
		 }
		 
		 return pre;
	}
	
	
}
