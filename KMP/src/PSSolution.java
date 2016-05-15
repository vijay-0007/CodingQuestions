
public class PSSolution {

	public static void main(String[] args) {
		
			System.out.println(matchString("SOCIA*TWIST","SOCIALTWI*T"));
			System.out.println(matchString("HELLO*","HI*"));
			System.out.println(matchString("PROFESS*","*PROFESS"));
			System.out.println(matchString("*EXAMPLETEST","THIRDEXAMPLE*"));
			System.out.println(matchString("*TELL","*AFRIEND"));
			System.out.println(matchString("*","B*"));
			System.out.println(matchString("*C","D*"));
	
	}

	private static String matchString(String str1, String str2) {
	
	
		int len1 = str1.length();
		int len2 = str2.length();
	
		char[] str1char = new char[len1+len2];
		char[] str2char = new char[len1+len2];
		
		int start = len1>len2?len1:len2;
		
		for(;start<(len1+len2);start++){
			
			fillArray(str1char,str1,start-len1);
			fillArray(str2char,str2,start-len2);
			
			if(compair(str1char,str2char)){
				return getString(str1char);
			}
		}
		
		return "not-possible";
	}

	private static boolean compair(char[] str1char, char[] str2char) {
		
		for(int i=0 ; str1char[i]!=0 ;i++){
			
			if(str1char[i]=='*'){
				str1char[i]=str2char[i];
			}
			else if(str2char[i]=='*'){
				str2char[i]=str1char[i];
			}
			else if(str1char[i]!=str2char[i]){
				return false;
			}
		}
		
		return true;
	}

	private static void fillArray(char[] strChar, String str, int add) {
		
		int j=0;
		
		for(int i=0;i<str.length();i++){
			
			if(str.charAt(i)=='*'){
				
				while(add>0){
					strChar[j++]='*';
					add--;
				}
			}else{
				strChar[j++]=str.charAt(i);
			}
			
			}
		strChar[j]=0;
	}
	
	private static String getString(char[] strchar) {
		String ans = "";
		
		for(int i=0 ; strchar[i]!=0;i++)
			ans+=strchar[i];
		return ans;
	}
}
