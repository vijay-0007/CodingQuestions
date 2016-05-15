
public class RBNode<key extends Comparable<key>, value>{

	public static final boolean RED = true ;
	public static final boolean BLACK = false ;
	
	key key;
	value value;
	boolean color;
	RBNode<key , value> left , right ;

	public RBNode(key k , value v , boolean col) {
		key=k;
		value=v;
		color=col;
	}
	
	
	public boolean isRed(RBNode<key , value> node){
		
		if(node==null)
			return false;
		return node.color==RED;

	}
	
}
