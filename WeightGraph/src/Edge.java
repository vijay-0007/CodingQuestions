
public class Edge implements Comparable<Edge>{

	private int from;
	private int to;
	private int weight;
	
	public Edge(int from , int to , int weight) {
		this.from=from;
		this.to=to;
		this.weight=weight;
	}
	
	public int either(){
		return from;
	}
	
	public int other(int vertex){
		
		if(from==vertex)
		return to;
		else
		return from;

	}
	
	
	public int getFrom() {
		return from;
	}
	public void setFrom(int from) {
		this.from = from;
	}
	public int getTo() {
		return to;
	}
	public void setTo(int to) {
		this.to = to;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public int compareTo(Edge o) {
		
		if(o.weight>this.weight)
			return -1;
	
		else if(o.weight<this.weight)
			return 1;
		
		else
			return 0;
		
	}
}
