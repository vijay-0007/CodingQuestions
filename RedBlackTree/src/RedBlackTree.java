
public class RedBlackTree<key extends Comparable<key>,value> {

	private RBNode< key , value> root;

	public RBNode<key, value> getRoot() {
		return root;
	}

	public void setRoot(RBNode<key, value> root) {
		this.root = root;
	}
	
	public  value getValue(key crit){
		
		RBNode<key, value> temp = root ;
		return getValue(crit,temp);	
		
	}

	private value getValue(key crit, RBNode<key, value> temp2) {
		
		if(temp2==null)
			return null;
		
		if(temp2.key.compareTo(crit)==0)
			return temp2.value;
		
		if(temp2.key.compareTo(crit)==-1)
			return getValue(crit,temp2.right);
			
		
		if(temp2.key.compareTo(crit)==1)
			return getValue(crit,temp2.left);

		return null;
		
	}
	
	public void add(key crit, value val){
	
		RBNode<key, value> temp = root ;
		root = add(crit,val,temp);	
		
	}

	private RBNode<key,value> add(key crit, value val, RBNode<key, value> temp) {
		
		if(temp==null)
			return new RBNode<key,value>(crit,val,true);
	
		if(temp.key.compareTo(crit)==0){
			temp.value=val;
		}
		
		if(temp.key.compareTo(crit)==-1)
			temp.right = add(crit,val,temp.right);
			
		
		if(temp.key.compareTo(crit)==1)
			temp.left = add(crit,val,temp.left);
		
		if(temp.isRed(temp.right) && !temp.isRed(temp.left))
			temp=rotateLeft(temp);
		
		if(temp.isRed(temp.right) && temp.isRed(temp.right.right))
			temp=rotateRight(temp);
		
		if(temp.isRed(temp.right) && temp.isRed(temp.left))
			temp=flip(temp);
		
		return temp ;

	}

	private RBNode<key, value> flip(RBNode<key, value> temp) {
		
		
		temp.right.color=false;
		temp.left.color=false;
		temp.color=true;
		
		return temp;
	}

	private RBNode<key, value> rotateRight(RBNode<key, value> temp) {
		
		RBNode<key, value> tempVar = temp.left; 
		
		temp.left=tempVar.right;
		tempVar.right=temp;
		tempVar.color=temp.color;
		temp.color=true;
		return tempVar;
	}

	private RBNode<key, value> rotateLeft(RBNode<key, value> temp) {

		RBNode<key, value> tempVar = temp.right; 
		
		temp.right=tempVar.left;
		tempVar.left =temp;
		tempVar.color=temp.color;
		temp.color=true;
		return tempVar;
	}
	
}
