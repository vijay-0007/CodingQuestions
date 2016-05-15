
public class mergeSort {

	
	public static void main(String[] args) {
		int arr[]={123,23,23,12312,31};
		
		sortArray(arr,0,arr.length-1);
		
		for (int i : arr) {
			System.out.println(i);
		}
	}

	private static void sortArray(int[] arr, int min, int max) {
		
		if(min < max){
			
			int middle = (max+min)/2;
			
			sortArray(arr,min,middle);
			sortArray(arr,middle+1,max);
			
			merge(arr,min,middle,max);
		}
	}

	private static void merge(int[] arr, int min, int middle, int max) {
		
		int value[]=new int[max-min+1];
		int curr = 0 ;
		int i = min ;
		int j = middle+1;
		
		while(i<=middle && j <=max){

			if(arr[i]>arr[j])
				value[curr++]=arr[j++];
			else
				value[curr++]=arr[i++];
		}
		
		if(i>middle){
			while(j<=max)
				value[curr++]=arr[j++];
		}
		
		if(j>max){
			while(i<=middle)
				value[curr++]=arr[i++];
		}
		
		curr=0 ;
		
		while(min <=max)
			arr[min++]=value[curr++];
		
	}
	
}
