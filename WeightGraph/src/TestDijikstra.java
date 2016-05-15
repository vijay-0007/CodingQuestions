

public class TestDijikstra {

	
	public static void main(String[] args) {
		
		// directed graph 
		
		WeightedGraph g = new WeightedGraph(9);
		
		g.addEdge(0, 1, 4);
		g.addEdge(0, 7, 8);
		g.addEdge(1, 2, 8);
		g.addEdge(1, 7, 11);
		g.addEdge(2, 3, 7);
		g.addEdge(2, 8, 2);
		g.addEdge(2, 5, 4);
		g.addEdge(3, 4, 9);
		g.addEdge(3, 5, 14);
		g.addEdge(4, 5, 10);
		g.addEdge(5, 6, 2);
		g.addEdge(6, 7, 1);
		g.addEdge(6, 8, 6);
		g.addEdge(7, 8, 7);
	
		
		DjikstraAlgo dij = new DjikstraAlgo(g, 0);

		for (int i = 0; i < dij.dist.length; i++) {
			System.out.println( "Minimum distance from source " +0+" to destination "+i+" is "+dij.dist[i]);
		}
		
		
	}
	
	
}
