import java.util.LinkedList;
import java.util.Queue;


public class PrimsAlgo {
	
	private Queue<Edge> edg= new LinkedList<Edge>();
	private boolean visited[];
	private MinPQ<Edge> pq;

	public Queue<Edge> PrimsMST(WeightedGraph g){
		
		visited=new boolean[g.getVertex()];
		pq=new MinPQ<>();
		
		visited[0]=true;
		visit(g,0);
		
		while(pq.size()!=0){
			
			Edge  edge  = pq.delMin();
			int v = edge.either();
			int w = edge.other(v);
			
			
			if(visited[v] && visited[w])
				continue;
			
			edg.add(edge);
			
			if(!visited[v])
			visit(g, v);
			
			if(!visited[w])
				visit(g, w);
		}
		
		
		return edg ;
	}

	private void visit(WeightedGraph g, int i) {
		
		visited[i]=true;
		
		for(Edge edg : g.getEdgeForVertex(i)){
			
			if(!visited[edg.other(i)]){
				pq.insert(edg);
			}
		}
			
	}
	
}
