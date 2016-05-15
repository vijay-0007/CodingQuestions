import java.io.BufferedReader;
import java.io.InputStreamReader;

class stackQueue {
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line[] = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
   		int H = Integer.parseInt(line[1]);
   			
   		int arr[]=new int[N+1];
   		int arr1[][]=new int[N+1][N+1];
   		arr[0]=1;
   		arr[1]=1;
   		
   		arr1[1][1]=1;
  
   		
   		int sum=0;
   	
   		for (int i = 2; i < N+1; i++) {
   			
   			for(int j=0; j<i ;j++){
   				
   				arr[i]+=arr[j]*arr[i-j-1];
   				
   				if(i==N && j<H && i-j-1 <H)
   					sum+=(arr[j]*arr[i-j-1])*(j+1);
    
	    }
   		}	
	     System.out.println(sum);

   }
    }
