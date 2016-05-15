import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {
	

	public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader br = 
new BufferedReader(new InputStreamReader(System.in));
       
       int noOfFile = Integer.parseInt(br.readLine());
    
       HashMap< Integer, HashSet<Integer>> hashMap = new HashMap<Integer, HashSet<Integer>>();
       
       
       for(int i =0 ; i <noOfFile ;i++ ){
    	   	
    	   String line[] = br.readLine().split(" ");
    	   
    	   HashSet<Integer> hashSet = new HashSet<>();
    	   
    	   for(int j=0 ; j < Integer.parseInt(line[0]) ; j++){

    		   hashSet.add(Integer.parseInt(line[j+1]));
    	   }
    	   
    	   hashMap.put(i, hashSet);
       }
   
       int noTest= Integer.parseInt(br.readLine());
       
       
       while (noTest > 0 ) {
    	   
    	   String testLine[] = br.readLine().split(" ");
    	  
    	   int testValue[]=new int[testLine.length];
    	   
    	   for(int i = 0 ; i<testLine.length  ; i++){
    		   testValue[i]=Integer.parseInt(testLine[i]);
    	   }
    	   
    	   testData(hashMap,testValue);
   
    	   noTest-- ;
	}
       
   }

	private static void testData(HashMap<Integer, HashSet<Integer>> hashMap,
			int[] testValue) {
		
	
		
		if(testValue[0]==1){
			
			int size = hashMap.size();
			
			int value = 0 ;
			
			for (int i =0; i < size ;i++){
				
				HashSet<Integer> hashSet = hashMap.get(i);
				
				int count=0;
				
				for(int j = 0 ; j < testValue[1];j++ ){
					 
					if(hashSet.contains(testValue[j+2])){
						count++;
					}
					
				}
					
					if(count == testValue[1])
						value++;
					
			}
			System.out.println(value);
		}
		
		
if(testValue[0]==2){
			
			int size = hashMap.size();
			
			int value = 0 ;
			
			for (int i =0; i < size ;i++){
				
				HashSet<Integer> hashSet = hashMap.get(i);
				
				int count=0;
				
				for(int j = 0 ; j < testValue[1];j++ ){
					 
					if(hashSet.contains(testValue[j+2])){
						count++;
						break ;
					}
					
				}
					if(count > 0 || testValue[1]==0)
						value++;
					
			}
			System.out.println(value);
		}
	

if(testValue[0]==3){
	
	int size = hashMap.size();
	
	int value = 0 ;
	
	for (int i =0; i < size ;i++){
		
		HashSet<Integer> hashSet = hashMap.get(i);
		
		int count=0;
		
		for(int j = 0 ; j < testValue[1];j++ ){
			 
			if(hashSet.contains(testValue[j+2])){
				count++;
			}
			
		}
			if(count >  0  &&  count < testValue[1] )
				value++;
		
	}
	System.out.println(value);
}

	}
	
}