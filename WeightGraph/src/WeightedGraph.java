import java.util.ArrayList;


public class WeightedGraph {

	private int vertex ;
	private ArrayList<ArrayList<Edge>> arr;
	
	
	
	public int getVertex() {
		return vertex;
	}
	
	public ArrayList<Edge> getEdgeForVertex(int i){
		return arr.get(i);
	}

	public WeightedGraph(int vertex) {
		this.vertex=vertex;
		
		arr=new ArrayList<ArrayList<Edge>>();
		
		for (int i = 0; i < vertex; i++) {
			arr.add(i,new ArrayList<Edge>());
		}	
	}
	
	public void addEdge(int from,int to , int weight){
		
		arr.get(from).add(new Edge(from, to, weight));
//		arr.get(to).add(new Edge(to, from, weight));
	}
	
	public ArrayList<Edge> allEdge(){
		
		ArrayList<Edge> allEdgeForGraph=new ArrayList<>();
		
	
		for(ArrayList<Edge> edge:arr){
			allEdgeForGraph.addAll(edge);
		}
		
		return allEdgeForGraph;
	}
	
}
