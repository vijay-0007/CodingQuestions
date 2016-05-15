
public class MinWindow {

	
	public static void main(String[] args) {
		
		String text = "adakjdaljasda";
		String pattern = "adj";
		
		minWindow(text,pattern);
		
	}

	private static void minWindow(String text, String pattern) {
		
		int T = text.length();
		int P = pattern.length();
		
		int pat[]=new int[256];
		int txt[]=new int[256];

		int count =0;
		int min=0;
		int max=0;
		int diff=Integer.MAX_VALUE;
		for(int i=0 ; i < P ;i++)
			pat[pattern.charAt(i)]++;
		
		for(int i=0 ; i < T ; i++){
			
			if(pat[text.charAt(i)] < 0)
				continue ;
			
			txt[text.charAt(i)]++;
			
			if(txt[text.charAt(i)]<=pat[text.charAt(i)])
				count++;
			
				while(count==P && min <256){
					
					if(pat[text.charAt(min)]==0){
						min++;
					}else if(pat[text.charAt(min)]<txt[text.charAt(min)]){
						txt[text.charAt(min)]--;
						min++;
						
					}else
						break;

				}
		
				if(count==P){
					
					if(diff > min-i){
						diff=i-min;
						max=i;
					}
				}
				
		}
	
		System.out.println(diff+1);
		
	}
	
	
}
