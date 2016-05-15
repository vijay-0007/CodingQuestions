
public class UnionFind {
	
	
	private int arr[];
	private int size[];

	public UnionFind(int totalEle) {
		
		arr= new int[totalEle];
		size= new int[totalEle];
		
		for (int i = 0; i < totalEle; i++) {
			arr[i]=i;
			size[i]=1;
		}
		
	}
	
	public boolean isConnected(int v1,int v2 ){
		
		return (root(v1)==root(v2));
			
		}

	private int root(int v1) {
	
		int i=v1;
		
		while(i!=arr[i]){
			arr[i]=arr[arr[i]];
			i=arr[i];
		}
		
		return i ;
	}
	
	public void connect(int v1,int v2){
		
		int i=root(v1);
		int j=root(v2);
		
		if(i==j)
			return ;
		
		if(size[i] < size[j]){
			arr[i]=j;
			size[j]+=size[i];
		}else{
			arr[j]=i;
			size[i]+=size[j];
		}

	}
	
}
