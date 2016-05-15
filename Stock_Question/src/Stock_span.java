import java.util.Stack;


public class Stock_span {

	
		public static void main(String[] args) {
	
			int price[] = {10, 4, 5, 90, 120, 80};
			Stack<Integer> stk = new Stack<Integer>();
			
			for (int i = 0; i < price.length; i++) {
				
				while(!stk.isEmpty()){
					
					if(price[stk.peek()] <= price[i]){
						stk.pop();
					}else
						break;
					
				}
					int t=-1;
					
					if(!stk.isEmpty())
						t = stk.peek();
					
					stk.push(i);
					
					System.out.print(i-t+" ");
					
				}
				
				
			}
			
			
			
		}
	
