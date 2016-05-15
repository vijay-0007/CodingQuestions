
public class LIS_NLOGN {

	
	public static void main(String[] args) {
		
		
		int arr[] = { 2, 5, 3, 7, 11, 8, 10, 13, 6 };
		
		System.out.println(getLISLen(arr,arr.length));
		
	}

	private static int getLISLen(int[] arr, int length) {
		
		if(length==0)
			return 0;
		
		int tailTable[]=new int[length];
		
		tailTable[0]=arr[0];
		int len=1 ;
		
		
		for(int i=1 ; i < length ;i++){
			 // condition 1 
			if(arr[i] < tailTable[0]){
				tailTable[0] = arr[i]  ;
			}
			// condition 2
			else if (arr[i] > tailTable[len-1]) {
				tailTable[len++]=arr[i];
			}
			// condition 3
			else{
				tailTable[ceilIndex(arr[i],tailTable ,-1 , len -1)]=arr[i];
			}
		}
		return len;
	}

	private static int ceilIndex(int value, int[] tailTable, int l, int r) {
	  
		while(r-l > 1){
		int	m = (l+r)/2;
			
			if(tailTable[m] >= value)
				r=m;
			else
				l=m;
				
		}
		return r ;
	}
	
}
