import java.io.BufferedReader;
import java.io.InputStreamReader;

class test3 {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int size = Integer.parseInt(line.split(" ")[0]);
       	int op = Integer.parseInt(line.split(" ")[1]);
       	
       	char str[] = br.readLine().toCharArray();
       	
       
       for (int i = 0; i < op; i++) {
       	
           String operation[] = br.readLine().split(" ");
           
           if(operation[0].equals("0")){
           	str[Integer.parseInt(operation[1])-1]=operation[2].toCharArray()[0];
           }else{
           	
           		check(str , Integer.parseInt(operation[1]) , Integer.parseInt(operation[2])  ,Integer.parseInt(operation[3]));
           	
           }
        }  
    }
    
    public static void check(char[] ch , int l , int r , int k ){
    
    		int arr[]=new int[26];
    		
    		for(int i = l ; i <= r ;i++)
    			arr[ch[i-1]-97]++;
    			
    			
    			int check =0;
    			
    			for(int i=0 ;  i < 26 ; i++){
    			
    			check += arr[i];
    			if(check>=k){
    				char chh = (char)(i+97);
    				System.out.println(chh);
    				return;
    			}
    			
    			}
    			
    }
}
