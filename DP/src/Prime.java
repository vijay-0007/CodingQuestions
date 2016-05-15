import java.util.Arrays;
import java.util.Scanner;


public class Prime {

	public static void main(String[] args) {
		
		// print prime number array up to 1000
	
		long curr = System.currentTimeMillis();
		
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
	 
	 
	System.out.println((System.currentTimeMillis()-curr));

	
	
		
	}
}
