public class HeapSort {

	static int size ;
	
	public static void main(String[] args) throws Throwable {
	
		
		
		int arr[]={6,5,32,3,32,3,3,4,5,2};
		
		size=arr.length;
		
		heapSort(arr,size);
		
		for (int i = 0; i <arr.length; i++) {
			System.out.println(getMax(arr));
		}

	}

	private static void heapSort(int[] arr, int length) {
		
		for(int i=length/2 ; i >=0 ;i--)
			sink(arr,i,length);
		
	}

	private static void sink(int[] arr, int i, int length) {
		
		int j=2*i+1 ;
		
		while(j < length ){
		
			if(j+1< length  && arr[j+1]>arr[j])
				j=j+1;
		   
			if(arr[i]<arr[j]){
				int temp = arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				
			}else
				break;
				
			i=j;
		}
	}
	
	
	private static int getMax(int arr[]) throws Exception{
		
		int temp =arr[0];
		
		if(size==0)
			throw new Exception("array out of bound");
		
		
		arr[0]=arr[size-1];
		size--;
		sink(arr, 0, size);
		return temp;
	}
	
}
