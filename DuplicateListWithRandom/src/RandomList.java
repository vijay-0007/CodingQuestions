public class RandomList {

	Node head = null ;
	
	void add(int value){
		Node node= new Node(value);
		node.next=head;
		head=node;
	}
	
	void traverse(){
	Node headNode=head;
		
		while(headNode!=null){
			System.out.println(headNode.value);
			headNode=headNode.next;
		}
		
	}
}
