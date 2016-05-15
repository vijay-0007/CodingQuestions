
public class One_Buy_One_Cell {
	
	public static void main(String[] args) {
		
		int arr[]={80, 2, 6, 3, 100};;
		
		int profit=0;
		int min=arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			
			if(min < arr[i]){
				
				if(arr[i]-min > profit)
					profit=arr[i]-min;
			
			}else
				min=arr[i];
		}
		
		System.out.println(profit);
		
		
	}

}
