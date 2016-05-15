import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;



class tete {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        
        ArrayList<Long> arr= new ArrayList<Long>(); 
        
        int N = Integer.parseInt(line);
        
        String nu[]=br.readLine().split(" ");
        	System.out.println(nu.length);
        	System.out.println(nu);
        for (int i = 0; i < N; i++) {
       
            arr.add(Long.parseLong(nu[i]));
        }
        
        System.out.println("asd");
        
        Collections.sort(arr);
  		
  		ArrayList<Long> narr= new ArrayList<Long>(); 
  		
  		int len = nu.length-1;
  		int j =0 ;
  		
  		while(j<len){
  			narr.add(arr.get(j++));
  			narr.add(arr.get(len--));
  		}
  		
  		int ans = 0 ;
  		
  		for(int i=0 ; i < narr.size()-1;i++){
  				ans += Math.abs(narr.get(i)-narr.get(i+1));	
  		}
  		
  		ans += Math.abs(narr.get(narr.size()-1)-narr.get(0));
  		
		System.out.println(ans);
		
    }
}
