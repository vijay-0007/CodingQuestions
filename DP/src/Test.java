import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Test {
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        
        HashMap<String,Integer> cc = new HashMap<String,Integer>();
        
        Integer count =0 ;
        
        for (int i = 0; i < N; i++) {
        	
        	String ss = new String(br.readLine());  
        	
        		if(cc.containsKey(ss))
        			  count+=cc.get(ss);
        			
        		ss = rev(ss);
        		
        	
        		Integer ii = 1; 
        			
        		if(cc.containsKey(ss)){
        			ii = cc.get(ss)+1;	
        		}
       
           		cc.put(ss,ii);
        }
        
        System.out.println(count);
       
    }
    
    public static String rev(String s){
    	
    	String ss="";
    	
    	for(int i=s.length()-1; i>=0;i--){
    		ss+=s.charAt(i);
    	}
    	return ss;
    }
    
}