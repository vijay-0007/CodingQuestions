
public class Test {

	public static void main(String[] args) {
		
		TreeStruc t = new TreeStruc();
		
		t.add(10);
		t.add(30);
		t.add(40);
		t.add(20);
		t.add(13);
		t.add(15);
		t.add(60);
		t.add(5);
		
		t.inOrder(t.root);
	
	}
	
}

