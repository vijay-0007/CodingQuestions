
public class Trie<Value>{

	Trienode trienode=new Trienode();

	public void add(String key,Value value) {
		
		if(!"".equals(key) && key != null ){
	
			trienode=addInTrie(trienode,key,value,0);
			
		}else
			throw new IllegalArgumentException() ;
		
	}

	private Trienode addInTrie(Trienode node, String key, Value val, int j) {
	
		if(node==null)
			node= new Trienode();
		
		if(j==key.length()){
			node.value=val ;
			return node;
		}
		
		char c = key.charAt(j);
	    node.trienode[c]=addInTrie(node.trienode[c], key, val, j+1);		
	    return node;
	}
	
	public boolean contains(String key){
		  return get(key)!=null ;
	}

	private Object get(String key) {
		Trienode  x =  get(trienode,key,0);
		
		if(x==null)
			return null ;
		return  (Value)x.value;
	} 

	private Trienode get(Trienode node, String key, int i) {
		
		if(node==null)
		return null ;
		
		if(key.length()==i)
		return node;
		
		char c = key.charAt(i);
		return get(node.trienode[c], key, i+1);
 
	}

}
