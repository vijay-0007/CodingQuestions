import java.util.Queue;


public class Test {

	
	public static void main(String[] args) {
		
		WeightedGraph g = new WeightedGraph(4);
		
		g.addEdge(0, 1, 10);
		g.addEdge(0, 2, 6);
		g.addEdge(0, 3, 5);
		g.addEdge(1, 3, 15);
		g.addEdge(2, 3, 4);
	
		KruskalAlgo algo=new KruskalAlgo();
	
		Queue<Edge> edge = algo.kruskalMST(g);
		
		
		for (Edge edge2 : edge) {
			System.out.println("from vertex "+edge2.getFrom()+" to vertex "+edge2.getTo()+" and weight is "+edge2.getWeight());
		}
		
	}
	
	
}
