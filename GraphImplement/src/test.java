
public class test {

	public static void main(String[] args) {
		GraphImp g = new GraphImp(6);

		g.addEdge(5,2);
		g.addEdge(5,0);
		g.addEdge(4,0);
		g.addEdge(4,1);
		g.addEdge(2,3);
		g.addEdge(3,1);
		
		//g.DFS();
		
		g.topological();
		
		//g.printGraph();

	}
}
