
public class Inversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int arr[]={5,4,3,2,1};
		
		System.out.println(getInvCount(arr, 5));

	}
	
	
	public static int getInvCount(int arr[], int n)
	{
	  int inv_count = 0;
	  int i, j;
	 
	  for(i = 0; i < n - 1; i++)
	    for(j = i+1; j < n; j++)
	      if(arr[i] > arr[j])
	        inv_count++;
	 
	  return inv_count;
	}

}
