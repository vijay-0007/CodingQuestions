import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class question1 {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
			int test= Integer.parseInt(br.readLine());
			
			for(int i=0 ; i <test ;i++){
				solve(br);
			}
		
	}

	private static void solve(BufferedReader br) throws NumberFormatException, IOException {
		
		int number  =  Integer.parseInt(br.readLine());
			
		String arr[]=br.readLine().split(" ");
		
		int vote[]=new int[arr.length+1];
		
		int count = 0; 
		
		for(int i =0  ; i < arr.length ;i++){
			
			
			vote[i+1]=Integer.parseInt(arr[i]);
			
			if(vote[i+1]==number){
				System.out.println("-1");
				return ;
			}
				
			
			count+=vote[i+1];
			
		}
		
		if(count!=number){
			System.out.println("-1");
			return ;
		}
			
		int sol[]=new int[arr.length+1];
		
		for(int i=1 ; i <vote.length ;i++){
			
			int personVal = vote[i];
			int point=0;
			for (int j = 1; j < sol.length; j++) {
				
				if(personVal==0)
					break;
				
				if(i==j)
					continue;
				
				if(sol[j]==0){
					
					if(sol[i]==j){
						point=j ;
					}else{
						personVal--;
						sol[j]=i;
					}
					
				}
				
			}
			
			if(personVal==1 && sol[point]==0){
				personVal--;
				sol[point]=i;
			}
			if(personVal!=0)
			{
				System.out.println("-1");
				return ;
			}
			
		}
		
	for (int i = 1; i < sol.length; i++) {
		System.out.print(sol[i]+" ");
	}
		
	}
	
}
