
public class TestTrie {

	public static void main(String[] args) {
	
		Trie<Integer> t= new Trie<Integer>(); 
		t.add("hello", 4);
		System.out.println(t.contains("hello"));
	}
}
