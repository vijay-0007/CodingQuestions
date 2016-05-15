
public class maxPalindrom {

	public static void main(String[] args) {
		String s="abcdebababab";
		
		System.out.println(maxPal(s));
		
	}

	private static int maxPal(String s) {
		
		int size = s.length();
		
		if(size==0)
			return 0 ;
		
		int maxLen=1;
		
		
		boolean arr[][]=new boolean[size][size];
		
		for(int i =0 ; i < size ; i++){
			arr[i][i]=true;
		}
		
		for(int i =0 ; i < size-1 ; i++){
			
			if(s.charAt(i)==s.charAt(i+1)){
				arr[i][i]=true;
				maxLen=2;
			}
		}
		
		for(int i=3 ; i<=size ;i++){
			
				for(int j=0 ;  j < size-i+1 ;j++){
				   
					int k = j+i-1 ;
				
					if(s.charAt(j)==s.charAt(k) && arr[j+1][k-1] ){
						arr[j][k]=true;
						maxLen=i;
					}
					
				}
		}
		
		
		return maxLen ;
		
	}
	
}
