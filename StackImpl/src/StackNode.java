
public class StackNode<Node>{
	
	Node data ;
	StackNode<Node> next;

	public StackNode(Node data) {
		this.data=data;
		this.next=null;
	}
		
	public Node getData() {
		return data;
	}
	public void setData(Node data) {
		this.data = data;
	}
	public StackNode<Node> getNext() {
		return next;
	}
	public void setNext(StackNode<Node> next) {
		this.next = next;
	}
}

