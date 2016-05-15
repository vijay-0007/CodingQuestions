
public class KMP {

	
	public static void main(String[] args) {
		
		String txt = "aaaaaaaaaaaaaaaaaaaaaaaaa";
		String pattern = "aaaaaaa";
		
		computeKmp(txt,pattern);
		
	}

	private static void computeKmp(String txt, String pattern) {
		
		int tL = txt.length();
		int pL = pattern.length();
		
		int lps[] = computeLps(pattern);
		int i=0 ;
		int j=0;
		
		
		while(i<tL){
			
			if(txt.charAt(i)==pattern.charAt(j)){
				i++;
				j++;
			}
			
			if(j==pL){
				System.out.println("pattern found at index "+(i-j));
				j=lps[j-1];
			}
			
			else if(i<tL && txt.charAt(i)!=pattern.charAt(j)){
				
				if(j!=0){
					j=lps[j-1];
				}else{
					i++;
				}
				
			}
			
		}
		
		
		
	}

	private static int[] computeLps(String pattern) {
		
		int pL = pattern.length();
		int lps[]=new int[pL];
		lps[0]=0;
		int i=1;
		int len=0;
		while(i<pL){
			
			if(pattern.charAt(i)==pattern.charAt(len)){
				len++;
				lps[i]=len;
				i++;
			}else{
				
				if(len!=0){
					len=lps[len-1];
				}else{
					lps[i]=0;
					i++;
				}	
			}
		}
		
		
		
		return lps;
	}
	
}
