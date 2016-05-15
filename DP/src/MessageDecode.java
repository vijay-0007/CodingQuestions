
public class MessageDecode {

		public static void main(String[] args) {
			
			
			String s = "01";
			System.out.println(decode(s));
			
			
		}

		
		 private static int decode(String s2) {
			
			 
			 int size=s2.length();
			 
			 if(size==0 || s2.charAt(0)=='0')
				 return 0 ;
			 
			 int arr[]=new int[size+1];
		
			 arr[0]=0;
			 arr[1]=1;
			 
			 
			 for(int i=2  ;  i <=size ; i++){
				 
				 if(s2.charAt(i-1)=='0'&&s2.charAt(i-2)=='0')
					 return 0 ;
				 
				if(s2.charAt(i-1)=='0'){

					if(s2.charAt(i-2)>'2')
				          return 0 ;
					
					 arr[i]=arr[i-2];
				}else{
				
					arr[i]=arr[i-1];
					if( (s2.charAt(i-2) ==  '2' && s2.charAt(i-1) < '7' ) || s2.charAt(i-2) == '1')
					 	arr[i]+=arr[i-2];
					
				}
			 }
			 
			 
			 return arr[size];
			}
}
