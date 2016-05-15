/* package whatever; // don't place package name! */


/* Name of the class has to be "Main" only if the class is public. */
class StringInter
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		test("XXY", "XXZ", "XXXXZY");
		
	}
	
	
	public static void test(String s1,String s2 , String s3){
		
		int s1l=s1.length();
		int s2l=s2.length();
		
		boolean arr[][]=new boolean[s1l][s2l];
		
		for(int i=0 ; i <= s1l ; i++){
			for(int j=0 ; j <= s2l ; j++){
				
				if(i==0 && j==0)
				arr[i][j]=true;
				
				else if(i==0 && s2.charAt(j-1)==s3.charAt(i+j-1))
						arr[i][j]=arr[i][j-1];
					
				else if(j==0 && s2.charAt(i-1)==s3.charAt(i+j-1))
						arr[i][j]=arr[i-1][j];
				
				else if	(s1.charAt(i-1)==s3.charAt(i+j-1) && s2.charAt(j-1)!=s3.charAt(i+j-1))
						arr[i][j]=arr[i-1][j];
						
				else if	(s1.charAt(i-1)!=s3.charAt(i+j-1) && s2.charAt(j-1)==s3.charAt(i+j-1))
						arr[i][j]=arr[i][j-1];
						
				else if	(s1.charAt(i-1)==s3.charAt(i+j-1) && s2.charAt(j-1)==s3.charAt(i+j-1))
						arr[i][j]=(arr[i][j-1]||arr[i-1][j]);
						
				}
			}
			System.out.println(arr[s1l][s2l]);
		}
	
	}
