import java.util.Stack;


public class HistogramArea {

	public static void main(String[] args) {
		
		
		int arr[]={6, 2, 5, 4, 5, 1, 6};
		
		System.out.println(maxArea(arr));
		
	}

	private static int maxArea(int[] arr) {
		
		int size=arr.length;
		
		if(size==0)
			return 0 ;
		
		
		int maxA[]=new int[size];
		int t, area = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i < size ; i++){
			
			while(!stack.isEmpty())
			{
				 
				if(arr[i] <= arr[stack.peek()])
					stack.pop();
				else
					break;
				
				
			}
			
		  if(stack.isEmpty())
			  t=-1;
		  else
			  t=stack.peek();
		  
		maxA[i]=i-t-1;
		stack.push(i);
		}
		
	while(!stack.isEmpty())
		stack.pop();

		
		for(int i=size-1; i>=0 ; i--){
			
			while(!stack.isEmpty())
			{
				 
				if(arr[i] <=arr[stack.peek()] )
					stack.pop();
				else
					break;
				
				
			}
			
		  if(stack.isEmpty())
			  t=size;
		  else
			  t=stack.peek();
		  
		maxA[i]+=t-i-1;
		stack.push(i);
		}
		
		for(int i =0  ; i <size ;i++){
			
			arr[i]=arr[i]*(maxA[i]+1);
			
			if(area < arr[i])
				area = arr[i];
				
		}
		
		return area;
	}
	
}
