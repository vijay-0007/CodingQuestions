
public class test {
	
	
	public static void main(String[] args) {
		
		IndexMinPQ<Integer> pq = new IndexMinPQ<>(4);

		pq.insert(0, 1);
		pq.insert(1, 4);	
		pq.insert(2, 12);
		pq.insert(3, 100);
		
	
		System.out.println(pq.minKey());
		
		pq.deleteMin();
		
		System.out.println(pq.minKey());
		
		pq.deleteMin();
		
		System.out.println(pq.minKey());

		pq.deleteMin();
		
		System.out.println(pq.minKey());
		
		pq.deleteMin();
	}
	
}
