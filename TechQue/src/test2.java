import java.util.HashSet;

public class test2 {
	
	public static void main(String[] args) {
				
		String mapping ="M1#W6#W10,M2#W1#W5,M3#W1#W3#W5#W9,M4#W3#W4,M5#W2#W6,M6#W1#W2#W6,M7#W1#W7#W8,M8#W8#W10,M9#W3#W9,M10#W10";
		
		String rec[] = mapping.split(",");

		HashSet<String> man=new HashSet<String>();
		HashSet<String> woman=new HashSet<String>();
		
		String mwArray[][] = new String[rec.length][];
	
		for(int i =0 ; i < rec.length ;i++){
			
			String splitRec[] =rec[i].split("#");
			
			mwArray[i] = new String[splitRec.length];			
			mwArray[i]=splitRec;
		
			for (int j = 0; j < splitRec.length; j++) {
				
				if(j==0)
					man.add(splitRec[j]);
				else
					woman.add(splitRec[j]);
			}
		}
		
		if(man.size()!=woman.size())
			System.out.println(0);
	
		HashSet<String> bookedW=new HashSet<String>();
		
		System.out.println(checkPoss(mwArray,0,bookedW));
			
		
		
		
	}

	private static int checkPoss(String[][] mwArray, int i,
			HashSet<String> bookedW) {

		if(i==mwArray.length){
			return 1;
		}
		
		int result = 0 ;
		
		for(int j=1 ; j < mwArray[i].length ;j++){
			
			if(bookedW.contains(mwArray[i][j])){
				continue ;
			}else{
				bookedW.add(mwArray[i][j]);
				result+=checkPoss(mwArray, i+1, bookedW);
				bookedW.remove(mwArray[i][j]);
			}
		}
		return result ;	
	}
}
