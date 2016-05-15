import java.util.Stack;


public class Histogram {
	
	public static void main(String[] args) {
	int arr[][]=	{{1},{1}};
	
	int len = arr.length;
	int max=0;
	int ar[]=new int[arr[0].length];
	
	
	
	for (int i = 0; i < len; i++) {
		
		for (int j = 0; j < ar.length; j++) {
			
			if(arr[i][j]==0)
				ar[j]=0;
			else
				ar[j]+=1;
		}
		
		int value= histoArea(ar);
		
		if(value>max)
			max=value;
		
	}
	
	System.out.println(max);

	}

	private static int histoArea(int[] arr) {
		
		int length =arr.length;
		
		int max=0;
		
		Stack<Integer> stk = new Stack<Integer>();
		
		int area[]=new int[length];
		
		for(int i=0; i <length;i++){
			
			while(!stk.isEmpty()){
				
				if(arr[stk.peek()]>=arr[i])
					stk.pop();
				else
					break;
			}
			
			int t=-1;
			
			if(!stk.isEmpty())
				t=stk.peek();
			
			stk.push(i);
			
			area[i]=i-t-1;
		}
			stk.clear();
		
		for(int i=length-1 ;i >= 0 ;i--){
			
			while(!stk.isEmpty()){
				
				if(arr[stk.peek()]>=arr[i])
					stk.pop();
				else
					break;	
			}
			
			int t=length;
			
			if(!stk.isEmpty())
				t=stk.peek();
			
			stk.push(i);
			
			area[i]+=t-i-1;
		}
		
		for(int i=0 ; i <length ;i++)
			if((area[i]+1)*arr[i] > max)
				max=(area[i]+1)*arr[i];
		
		return max;
	}
}
