

public class StackTest {

	public static void main(String[] args) {
		
		StackImpl<Integer> impl= new StackImpl<Integer>();
		
		impl.push(100);
		impl.push(200);
		impl.push(300);
		impl.push(400);
		impl.push(500);
		
		
	reverseStack(impl);
		

	System.out.println(impl.pop());
	System.out.println(impl.pop());
	System.out.println(impl.pop());
	System.out.println(impl.pop());
	System.out.println(impl.pop());
		
		
	}

	private static void reverseStack(StackImpl<Integer> impl) {
		
		if(impl.size!=0){
			Integer temp = impl.pop();
			reverseStack(impl);
			pushAtBottom(impl,temp);
		}	
	}

	private static void pushAtBottom(StackImpl<Integer> impl, Integer temp) {
		
		if(impl.size==0){
			impl.push(temp);
			return ;
		}else{
			Integer data = impl.pop();
			pushAtBottom(impl,temp);
			impl.push(data);
		}
	}
	
}

