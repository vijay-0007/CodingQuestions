
public class CoinChange {

	public static void main(String[] args) {
		
		int coin[]={1,2,3};
		int value=4;
		System.out.println(getVal(coin,value));
		
	}

	private static int getVal(int[] coin, int value) {
		
		int dp[]=new int[value+1];
		dp[0]=1;
		
		for(int i=0 ; i < coin.length ; i++)
			for(int j=coin[i];j <=value ; j++)
				dp[j]+=dp[j-coin[i]];
		
		return dp[value];
	}
}
