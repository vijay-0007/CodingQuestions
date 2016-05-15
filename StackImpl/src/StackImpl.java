
public class StackImpl<Node>{

	StackNode<Node> head ;
	int size=0;
	
	public void push(Node data){
		
		this.size++;
		StackNode<Node> node = new StackNode<>(data);
		node.next=head;
		this.head=node;
		
	}
	
	public Node pop(){
		
		if(size==0 || null==this.head){
			throw new StackOverflowError("stack is empty");
		}else{
			
			StackNode<Node> node =this.head;
			this.size--;
			this.head=this.head.next;
			return node.data;
		}
	}
	
}

