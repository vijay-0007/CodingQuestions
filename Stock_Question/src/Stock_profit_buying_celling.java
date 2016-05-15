
public class Stock_profit_buying_celling {

	static class inv{
		int start ; 
		int end ;
	}
	
	public static void main(String[] args) {
		
		int arr[]={100, 180, 260, 310, 40, 535, 695};
		
		inv innv[]=new inv[arr.length/2];
		
		int i=0;
		int count=0;

		while( i < arr.length){
			
			while ((i< (arr.length-1)) && (arr[i]>=arr[i+1])) {
				i++;
			}		
			
			if(i==arr.length)
				break ;
			
			innv[count]=new inv();
			
			innv[count].start=i++;
			
			while ((i< arr.length) && (arr[i-1]<=arr[i])) {
				i++;
			}
			
			innv[count].end=i-1;
			
			count++;	
		}
		
		for (int j = 0; j < count; j++) {
			
			System.out.println("buy at "+innv[j].start +" end sale at "+innv[j].end);
			
		}
		
		
	}
	
		
}
