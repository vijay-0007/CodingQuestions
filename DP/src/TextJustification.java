

public class TextJustification {

	public static void main(String[] args) {
	
		int l[] = {3, 2, 2, 5};
		
		
		
		textJustification(l,6);
		
	}

	private static void textJustification(int[] l, int wordSize) {
		
		int length=l.length;
		// it content no of blank space if , word from i  to j are in one line  
		int arr[][]=new int[length+1][length+1];
		// it contains value of bad allignment  
		int lc[][]=new int[length+1][length+1];
		// c[i] have the cost of optimal arrengment for 1 to i ;
		int c[]=new int[length+1];
		// path 
		int p[]=new int[length+1];
		
		for(int i=1 ;i <=length ;i++){
			
			arr[i][i]=wordSize-l[i-1];

			for(int j=i+1 ; j<=length ;j++){
				arr[i][j]=arr[i][j-1]-l[j-1]-1; //-1 for space
			}
		}
		
		
		for(int i=1 ;i <=length ;i++){
			for(int j=i ; j<=length ;j++){
				if(arr[i][j] < 0)
					lc[i][j]=Integer.MAX_VALUE;
				else if( j==length && arr[i][j]>=0 )
					lc[i][j]=0;
				else
					lc[i][j]=arr[i][j]*arr[i][j];
			}
		}
		
		
		for(int i=1;i <=length ; i++){
			c[i]=Integer.MAX_VALUE;
			
			for(int j=1 ; j <=i ;j++){
				
				if(c[j-1]!=Integer.MAX_VALUE && lc[j][i]!=Integer.MAX_VALUE && (c[j-1]+lc[j][i] <c[i]) ){
					c[i]=c[j-1]+lc[j][i];
					p[i]=j;
				}
				
			}
		}
		
		
		for(int i=1;i <=length ; i++)
			System.out.println();
		
	  print(p,length);

	}

	private static void print(int[] p, int l ) {
	
		if(p[l]==0)
			return;
		print(p,p[l]-1);
		System.out.println("it take form " + p[l] +" to "+ l);
		
	}
}
