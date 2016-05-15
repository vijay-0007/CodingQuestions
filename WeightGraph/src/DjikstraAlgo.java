import java.util.Arrays;


public class DjikstraAlgo {
	int edgeTo[];
	double dist[];
	IndexMinPQ<Double> pq;
	
	public DjikstraAlgo(WeightedGraph g , int source) {
		
		int v = g.getVertex();
		
		edgeTo=new int[v];
		dist=new double[v];
		pq=new IndexMinPQ<Double>(v);
		
		Arrays.fill(dist, Double.POSITIVE_INFINITY);
		
		dist[source]=0;
		pq.insert(source,0.0);
		
		while(!pq.isEmpty()){
			
			int vert = pq.deleteMin();
			
			for(Edge edg : g.getEdgeForVertex(vert)){
				
				relex(edg);
			}	
		}
	}

	private void relex(Edge edg) {
	
		int from = edg.either();
		int to= edg.other(from);
		
		
		if(dist[from]+edg.getWeight() < dist[to]){
			
			dist[to] = dist[from]+edg.getWeight() ;
		
			edgeTo[to]=from;
			
			if(pq.contains(to))
				pq.decreaseKey(to, dist[to]);
			else
				pq.insert(to, dist[to]);
		}
	}
	
}
