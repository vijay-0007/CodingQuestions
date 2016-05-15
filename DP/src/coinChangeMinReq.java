
public class coinChangeMinReq {

	
public static void main(String[] args) {
		
		int coin[]={1,2,3,4};
		int value=30;
		getVal(coin,coin.length,value);
		
	}

	private static void getVal(int coins[],int n,int cost) {
		
		int dp[][]=new int[cost+1][n+1];
		
		for(int i=0 ; i <= cost ; i++){
			for(int j=0 ; j<=n ;j++)
			dp[i][j]=999999;
		}
		
		for(int i=0;i<=n;i++)
			dp[0][i]=0;
		
		for(int i=1; i<=cost;i++){
			for(int j=1;j<=n ;j++){
			if(coins[j-1]>i && j>1){
			dp[i][j]=dp[i][j-1];
			}else if(coins[j-1]<=i){
				dp[i][j]=Math.min(1+dp[i-coins[j-1]][j],dp[i][j-1]);
			}
		 }
	  }
		
		System.out.println(dp[cost][n]);
	}
	
}
