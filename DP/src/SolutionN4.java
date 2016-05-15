import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SolutionN4 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        boolean arr[]=new boolean[10000000+1];
	 int arrUT[]=new int[10000000+1];
	 int current=0;
	 
	 Arrays.fill(arr,true);
	 
	 arr[0]=false;
	 arr[1]=false;
	 
	 int m = (int) Math.sqrt(10000000);
	 
	 for(int i=2 ; i<=m ; i++  ){
		 
		 if(arr[i]){
			 
			 for(int j=i*i ; j <=10000000 ;j+=i ){
				 arr[j]=false;
			 }
			 
		 }
		 
	 }
	 
	 for(int i=0 ; i <=10000000 ; i++ ){
		 
		 if(arr[i])
			 current++;
		 arrUT[i]=current;
		 
	 }
	
       int arrT[]=new int[41];
        arrT[0]=0;
        arrT[1]=1;
        arrT[2]=1;
        arrT[3]=1;
        arrT[4]=2;
        
        for(int i=5 ; i <=40 ; i++)
            arrT[i]=arrT[i-1]+arrT[i-4];
        
        BufferedReader br = 
                        new BufferedReader(new InputStreamReader(System.in));
        
        int testCase=Integer.parseInt(br.readLine());
        
        while(testCase > 0){
            
            int caseNo = Integer.parseInt(br.readLine());
            
            System.out.println(arrUT[arrT[caseNo]]);            
            testCase--;
        }
        
        
        
    }
}