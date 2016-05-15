import java.util.LinkedList;
import java.util.Queue;


public class KruskalAlgo {

	private Queue<Edge> edg= new LinkedList<Edge>();

	public Queue<Edge> kruskalMST(WeightedGraph g){
		
		MinPQ<Edge> pq= new MinPQ<>();
		
		for(Edge edg:g.allEdge()){
			pq.insert(edg);
		}
		
		UnionFind uf = new UnionFind(g.getVertex());
		
		while(pq.size()!=0 && edg.size() < g.getVertex()-1){
			
			Edge e=pq.delMin();
			
			int v = e.either();
			int q=e.other(v);
			
			if(!uf.isConnected(v, q)){
				uf.connect(v, q);
				edg.add(e);
			}
		}
		
		return edg;
	}
}
