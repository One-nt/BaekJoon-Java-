import java.util.Arrays;
import java.util.Scanner;

public class sol_2228 {
	public static int[][] dp;	
	public static int[] sum;
	public static boolean[][] check;	
	public static final int INVALID =  -32768 * 100;
	
	
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int m = s.nextInt();
		
		
		dp = new int[n+1][m+1];					
		sum = new int[n+1];
		check = new boolean[n+1][m+1];
		
		for (int i = 1; i < n+1 ; i++)
			sum[i] = s.nextInt() + sum[i-1];
		
		for (int[] row : dp) Arrays.fill(row, INVALID);
		
		System.out.print(DP(n, m));
		
		
				
	}
	
	
	public static int DP(int idx, int sec) {
		if (sec == 0)
			return 0;
		
		if (idx < 0)
			return INVALID;
		
		if(check[idx][sec])
			return dp[idx][sec];
		
		check[idx][sec] = true;		
		dp[idx][sec] = DP(idx-1, sec);
		
		
		for (int i = idx; i > 0; i--) 
			dp[idx][sec] = Math.max(dp[idx][sec], DP(i-2, sec-1) + (sum[idx] - sum[i-1]));	
		
		
		
		return dp[idx][sec];
	}
}
