import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		
		RandomList r=new RandomList();

		r.add(50);
		r.add(40);
		r.add(30);
		r.add(20);
		r.add(10);
		
		r.head.random=r.head.next.next;
		r.head.next.next.random=r.head.next.next.next;
		r.head.next.next.next.random=r.head;
		
		r.traverse();
		
		RandomList rNew=new RandomList();
		rNew.head=getCopy(r);
		
		 rNew.traverse();
		 System.out.println(r);
		 System.out.println(rNew);
	}

	private static Node getCopy(RandomList r) {
		
		if(r.head==null)
			return null ;
		
		Node headNode=r.head;
		HashMap<Node, Node> nodeMap=new HashMap<>();
		
		while(headNode!=null){
			Node DupNode=new Node(headNode.value);
			nodeMap.put(headNode, DupNode);
			headNode=headNode.next;
		}
		
		headNode=r.head;

		while(headNode!=null){
			
			Node DupNode = nodeMap.get(headNode);
			DupNode.next=nodeMap.get(headNode.next);
			DupNode.random=nodeMap.get(headNode.random);
			headNode=headNode.next;

		}
		return nodeMap.get(r.head);
	}
}
