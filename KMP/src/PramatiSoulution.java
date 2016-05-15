
public class PramatiSoulution {

	
	
	public static void main(String[] args) {
		
		char[] ans = new char[100];
		test test=new test();
		System.out.println(test.shortestCommon("LASTCASE*", "*LASTCASE"));
		
		System.out.println("abc".substring(1,2));
		
		//System.out.println(test("HOHOOHOHOHOHOHOHOHOHOOHOHHOOHHOOHOOHOHOHOHOOH*OHOH","HOHO*OHHOHOHOOHOHOOHOOHOHOHOOOOHOOHOHOHHHOHOOHOHOH",0,0,ans,0));
		
		//System.out.println(ans);
	}
	
	public static boolean test(String str1,String srtr2 , int index1 , int index2,char[] output,int outputIndex){
		
		
		if(index1>=str1.length() && index2>=srtr2.length()){
			System.out.println(outputIndex);
			System.out.println(output);
			return true;
		}
		
		
		if((index1>=str1.length() && srtr2.charAt(index2)!='*') || (index2>=srtr2.length() && str1.charAt(index1)!='*')){
			return false;
		}
		
		if(index1>=str1.length() && srtr2.charAt(index2)=='*'){
			return test(str1,srtr2 ,index1,index2+1,output,outputIndex);
		}
		
		if(index2>=srtr2.length() && str1.charAt(index1)=='*'){
			return test(str1,srtr2 ,index1+1,index2,output,outputIndex);
		}
		
		if(index1>=str1.length() && srtr2.charAt(index2)=='*'){
			return test(str1,srtr2 ,index1+1,index2+1,output,outputIndex);
		}
		
		
		if(str1.charAt(index1)=='*' && srtr2.charAt(index2)=='*'){
			return  (test(str1,srtr2 ,index1+1,index2+1,output,outputIndex)||test(str1,srtr2 ,index1,index2+1,output,outputIndex)||test(str1,srtr2 ,index1+1,index2,output,outputIndex));	
		}
		
		if(str1.charAt(index1)=='*'){

			output[outputIndex]=srtr2.charAt(index2);
		
			return  (test(str1,srtr2 ,index1+1,index2,output,outputIndex) || test(str1,srtr2 ,index1,index2+1,output,outputIndex+1));
		}
		
		
		if(srtr2.charAt(index2)=='*'){
			
			output[outputIndex]=str1.charAt(index1);
			
			return  ( test(str1,srtr2 ,index1,index2+1,output,outputIndex) || test(str1,srtr2 ,index1+1,index2,output,outputIndex+1));
		}
		
		if(str1.charAt(index1) == srtr2.charAt(index2)){

			output[outputIndex]=str1.charAt(index1);
		
			return  test(str1,srtr2 ,index1+1,index2+1,output,outputIndex+1);
		}
		
		return false;
	}
}
