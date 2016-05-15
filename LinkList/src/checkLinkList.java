
public class checkLinkList {

			LinkList head=null;	
			
			boolean isEmpty(){
				if(head==null)
					return true;
				else
					return false;
			}

			void addinList(int value){
				
				LinkList linkList=new LinkList();
				linkList.Value=value;
				linkList.next=head;
				head=linkList;
			}
			
			void readList(){
				LinkList pointer=head;
				
				while(pointer!=null){
					System.out.println(pointer.Value);
					pointer=pointer.next;
				}	
			}
}
