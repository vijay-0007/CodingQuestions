import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class GraphImp {
	
	int v; 
	ArrayList<ArrayList<Integer>> list;
	
	public GraphImp(int v) {
		
	this.v=v;
	list=new ArrayList<ArrayList<Integer>>(v);
	
	for (int i = 0; i < v ; i++) {
		list.add(i,new ArrayList<Integer>());
	}
	
	}
	
	public void addEdge(int vertex1, int vertex2){
		
		  list.get(vertex1).add(new Integer(vertex2));
		  // list.get(vertex2).add(new Integer(vertex1));
		
	}
	
	public void DFS(){
		
		Boolean boolean1[]=new Boolean[v]; 
		Arrays.fill(boolean1, false);
		
		for(int i=0 ; i<v ; i++){
			if(!boolean1[i]){
				doDFS(boolean1,i);
			}	
		}
	}

	private void doDFS(Boolean[] boolean1, int i) {
			
		boolean1[i]=true;
		
		System.out.println(i);

		ArrayList<Integer> vertex=list.get(i);
		
		Iterator<Integer> itr = vertex.iterator();
		
		while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();
			
			if(!boolean1[integer]){
				doDFS(boolean1,integer);
			}
		}	
	}
	
	public void printGraph(){
		
		for(int i =0 ; i < v ; i++){
			System.out.print("vertex  " + i );
			System.out.print("  -  ");
			
			for (Integer integer : list.get(i)) {
				System.out.print(" "+integer);
			}
			
			System.out.println();
		}		
	}

	public void topological() {
	
		Boolean boolean1[]=new Boolean[v]; 
		Arrays.fill(boolean1, false);
		
		Stack<Integer> stack=new Stack<>();
		
		for(int i=0 ; i<v ; i++){
			if(!boolean1[i]){
				doTopological(boolean1,i,stack);
			}	
		}
		
		while(!stack.isEmpty())
			System.out.println(stack.pop());
		
		
	}

	private void doTopological(Boolean[] boolean1, int i, Stack<Integer> stack) {
		
		boolean1[i]=true; 
		
		ArrayList<Integer> verList = list.get(i);
		
		Iterator<Integer> itr = verList.iterator();
		
		while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();
			
			if(!boolean1[integer]){
				doTopological(boolean1,integer,stack);
			}
		}
		
		stack.push(i);

	}
	
}
