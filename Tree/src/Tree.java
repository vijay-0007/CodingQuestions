
public class Tree {

	TreeNode root=null; 
	
	
	public void add(int value) {
		TreeNode node = new TreeNode(value);

		if (root == null) {
			root = node;
		} else {

			TreeNode curr = root;
			TreeNode parent;

			while (true) {

				if (curr.value > value) {
					parent = curr;
					curr = curr.left;

					if (curr == null) {
						parent.left = node;
						return;
					}

				} else {

					parent = curr;
					curr = curr.right;

					if (curr == null) {
						parent.right = node;
						return;
					}
				}
			}
		}
	}	

	public void inOrder(){
	  	inOrder(root);
	}
	
	

	private void inOrder(TreeNode root2) {
		
		if(root2!=null){
			inOrder(root2.left);
			System.out.println(root2.value);
			inOrder(root2.right);
		}
	}
	
	
}
