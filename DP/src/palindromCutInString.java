

public class palindromCutInString {

	public static void main(String[] args) {
		
		String pal = "cdd";
		
	System.out.println(getPalCutN2(pal,pal.length()));
		
	}

	// N^3 solution
	
	private static int palCut(String pal, int length) {
		
		if(length==0)
			return 0;
		
		int dp[][]=new int[length][length];
		boolean boolPal[][]=new boolean [length][length];
		
		for(int i=0 ; i < length ;i++){
			boolPal[i][i]=true;
			dp[i][i]=0;
		}
		
		for(int len=2 ; len <=length ;len++){
					
			for(int i=0 ; i < length-len+1 ;i++){
				
			int j=i+len-1;
			
			if(len==2)
				boolPal[i][j]=(pal.charAt(i)==pal.charAt(j));
			else
				boolPal[i][j]=(pal.charAt(i)==pal.charAt(j))&&boolPal[i+1][j-1];
			
			if(boolPal[i][j])
			{
				dp[i][j]=0;
			}else{
				
				dp[i][j]=Integer.MAX_VALUE;
				
				for(int k=i ; k < j ;k++){
					
					if( dp[i][k]+dp[k+1][j]+1 < dp[i][j]){
						dp[i][j]=dp[i][k]+dp[k+1][j]+1;
					}
					
				}
				
			 }
				
			}

		}
		
		return dp[0][length-1];
		
	}
	
	
	// N^2 solution 
	
	public static int getPalCutN2(String s,int len){
		
			if(len==0)
				return 0;
		
	boolean arr[][]=new boolean[len][len];
        
        for(int i =0 ; i < len ;i++)
            arr[i][i]=true;
        
        
        for(int lengt=2 ; lengt <= len ;lengt++){
            
            for(int i=0 ; i <= len-lengt ;i++){
                
               int j=i+lengt-1;
                
            
                if(lengt==2)
                    arr[i][j]=(s.charAt(i)==s.charAt(j));
                else    
                arr[i][j]=(arr[i+1][j-1] && s.charAt(i)==s.charAt(j));
            }
        }
        
        
            int count[]=new int[len] ;
                    
        
                for(int i=0;i <arr.length ;i++){
                
                if(arr[0][i]){
                    count[i]=0;
                }else{
                     
                     count[i]=Integer.MAX_VALUE;
                    
                    for(int j =0 ; j < i ; j++){
                        
                        if(arr[j+1][i] && count[i]>count[j]+1){
                            
                        count[i]=count[j]+1;
                        }
                        
                    }
                }
            }   
            
            return count[len-1];
	}
	
}
