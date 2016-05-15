
public class StringPermutation {

	public static void main(String[] args) {
		
		String str ="abc";
		
		char strArr[]=new char[str.length()];
		
		printPer(str,strArr,0,str.length());
		
	}

	private static void printPer(String str, char strArr[], int index,
			int length) {
		
		
		if(index==length){
			System.out.println(strArr);	
			return;
			}
		
		for(int i=0;i<length;i++){
			
			strArr[index]=str.charAt(i);
			
			printPer(str, strArr, index+1, length);
				
		}
	}
	
}
