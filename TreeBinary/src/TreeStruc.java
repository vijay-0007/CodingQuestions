
public class TreeStruc {

	TreeNode root = null ;
	
	
	public void add(int value){
		root=addValue(value,root);
	}
	
	private TreeNode addValue(int value, TreeNode root2) {
		if(root2==null)
			return new TreeNode(value);
		
		if(root2.value < value)
			root2.right=addValue(value,root2.right);
		else
			root2.left=addValue(value,root2.left);
		
		return root2;
	}
	
	public void inOrder(TreeNode node) {
	
			if(node==null)
				return ;
			
			inOrder(node.left);
			System.out.println(node.value);
			inOrder(node.right);
	}

	public boolean isEmpty() {
		if(root==null)
			return true ;
		else
			return false;
	}
	
}
