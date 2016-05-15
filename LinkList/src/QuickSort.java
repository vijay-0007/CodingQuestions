
public class QuickSort {

	
	public static void main(String[] args) {
		int arr[]={123,23,23,12312,31};
		
		sortArray(arr,0,arr.length-1);
		
		for (int i : arr) {
			System.out.println(i);
		}
	}

	private static void sortArray(int[] arr, int min, int max) {
		
		if(min < max){
			
			int p= part(arr,min,max);
				sortArray(arr,min,p-1);
				sortArray(arr,p+1,max);
		}
	}

	private static int part(int[] arr, int min, int max) {
	
	int	pivat = arr[max];
		
	int	i=min;

	for(int j=i ; j < max ; j++){
		
		if(arr[j]<=arr[max]){
			
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
		}
	}
	
	
	int temp=arr[i];
	arr[i]=arr[max];
	arr[max]=temp;
	
	return i;
	}

	
}

