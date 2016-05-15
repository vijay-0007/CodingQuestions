import java.util.HashSet;
import java.util.Set;


public class WordBreak {
	
		public static void main(String[] args) {
			
			String s="a";
			Set<String> set=new HashSet<String>();
			
			set.add("a");
			
		
			System.out.println(wordBreak(s,set));
					
			
		}

		private static boolean wordBreak(String s, Set<String> set) {
		
			int len = s.length();
			
			boolean arr[]=new boolean[len+1];
	
			for(int i = 1 ; i <=len ;i++){
			
				if(!arr[i] && set.contains(s.substring(0,i))){
				arr[i]=true;
				}
			
			
			if(arr[i]){
				
				int  j = i+1;
				
				for( ; j <=len ;j++){
							
						if(!arr[j]  && set.contains(s.substring(i,j)))
							arr[j]=true;
					
						if(j==len && arr[j])
							return true ;
					
					}	
				}		
			}	
			return false ;
		
		}
}
