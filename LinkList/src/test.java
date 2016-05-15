
public class test {
	
	/**
	 * @param args
	 */

	public static void main(String[] args) {
		
		checkLinkList cl = new checkLinkList();
		
			cl.addinList(10);
			cl.addinList(20);
			cl.addinList(30);
			cl.addinList(40);
			cl.addinList(50);
			cl.addinList(60);
			cl.addinList(70);
			cl.addinList(80);
			cl.addinList(90);
			cl.addinList(100);
			
			cl.head.next.next.next.next.next.next.next.next.next.next=cl.head.next.next.next.next.next.next ;
			
			 System.out.println(checkIsCircular(cl));
			 
			 cl.readList();
			 
			 
			 reverseRec(cl,cl.head);
			 
			 System.out.println("here");
			 
			 cl.readList();
			 
	}

	

	private static boolean checkIsCircular(checkLinkList cl) {
		
		LinkList slow = cl.head;
		LinkList fast = cl.head.next;

		
		while(fast!=null && fast.next!=null ){
			
			if(slow==fast){
				removeLoop(cl,slow);
				return true;
			}

			slow=slow.next;
			fast=fast.next.next;
		}
		
		return false ;
	}

	private static void removeLoop(checkLinkList cl, LinkList slow) {
	
	LinkList node=slow; 
	LinkList head = cl.head;
	LinkList fast = cl.head.next;
	
		while(node.next!=slow){
			node=node.next;
			fast=fast.next;
		}
		
		while(head!=fast){
			head=head.next;
			fast=fast.next;
		}
		
		while(fast.next!=head){
			fast=fast.next;
		}
		
		fast.next=null;
	}
	
	private static void reverse(checkLinkList cl){
			
		
		if(cl.head==null || cl.head.next==null)
			return ;
		
		LinkList curr=cl.head ;
		LinkList next=cl.head.next ;
		LinkList headNode=null;
		
		while(next!=null){
			
			curr.next=headNode;
			headNode=curr;
			curr=next;
			next=next.next;
		}
		
		curr.next=headNode;
		
  cl.head=curr;		
		
	}
	
	private static void reverseRec(checkLinkList c1 , LinkList l1){
		
		if(l1==null)
		return  ;
	
		if(l1.next==null){
			c1.head=l1;
			return ;
		}
		
		reverseRec(c1,l1.next);
		
		l1.next.next=l1;
		l1.next=null;
	
	}

}
