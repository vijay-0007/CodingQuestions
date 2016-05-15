
public class FillArray2NwithN {

	public static void main(String[] args) {
		
		int no=111;
		int arr[]=new int[no*2];	
		
		if(isPosible(arr,no,no)){
			
			for (int i : arr) {
				System.out.println(i);
			}
			
		}else
			System.out.println("No");
	}

	public static boolean isPosible(int[] arr, int curr, int no) {
		
		if(curr==0)
			return true ;
		
		for(int i=0 ; i < 2*no-curr-1; i++){
			
			if(arr[i]==0 && arr[i+curr+1]==0)
			{
				
				arr[i]=arr[i+curr+1]=curr;
				
				if(isPosible(arr, curr-1, no))
					return true;
			
				arr[i]=arr[i+curr+1]=0;
			}
		}
		
		return false;
	}
}
