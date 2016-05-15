
public class findCommonIn2SortedArray {

	public static void main(String[] args) {
		int arr1[] = {1, 5, 10, 20, 40, 80};
		int arr2[] = {6, 7, 20, 80, 100};
		int arr3[] = {3, 4, 15, 20, 30, 70, 80, 120};
		printComm(arr1,arr2,arr3);
	}

	private static void printComm(int[] arr1, int[] arr2, int[] arr3) {
	
		int i =0 ; 
		int j= 0 ;
		int k =0 ;
		
		while(true){
			
			if(i>=arr1.length || j>=arr2.length || k>=arr3.length)
				break ; 
			
			if(arr1[i]==arr2[j]&& arr2[j]==arr3[k]){
				System.out.println(arr1[i]);
				i++;j++;k++;
			}else{
				
				if(arr1[i]>arr2[j]){
					
					if(arr2[j]>arr3[k])
						k++;
					else
						j++;
					
				}else{
					
					if(arr1[i]>arr3[k])
						k++;
					else
						i++;
					
				}	
			}
		} 
	}
}
