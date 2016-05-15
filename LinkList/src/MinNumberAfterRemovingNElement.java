
public class MinNumberAfterRemovingNElement {

	
	public static void main(String[] args) {
		
		String number = "087654321";
		int num = 3 ; 
		StringBuffer newnumber = new StringBuffer("");
		
		getNewNumber(number,num,newnumber);
		
		System.out.println(newnumber);
	}

	private static void getNewNumber(String number, int num, StringBuffer newnumber) {
		
		if(num==0){
			newnumber.append(number);	
			return ;
		}
		
		int len = number.length();
		if(len <= num){
			return ;
		}
		
		int minIndex= 0 ; 

		for(int i=1 ;  i <=num;i++){
			if(number.charAt(minIndex) > number.charAt(i)){
				minIndex=i;
			}
		}
		
		newnumber.append(number.charAt(minIndex));
		getNewNumber(number.substring(minIndex+1), num -minIndex, newnumber);
		
	}
}
