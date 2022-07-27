import java.util.Scanner;

public class sol_24416 {
	public static long[] dp = new long[5001];		
	public static int recurNum = 0;
	public static int dpNum = 0;
	
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		
		int i = s.nextInt();
		
		recur(i);
		DP(i, dp);
		
		System.out.print(recurNum + " " + dpNum);
		
				
	}
	
	
	public static int recur(int i) {
		
		if (i == 1 || i == 2) {
			recurNum++;
			return 1;
		}
			
		
		else {			
			return (recur(i-1) + recur(i-2));
		}
			
	}
	
	public static long DP(int i, long[] dp) {
		
		if (i == 1 || i  == 2) {
			dpNum++;
			dp[i] = 1;
		}
			
		
		for (int j = 3; j <= i; j++) {
			dpNum++;
			dp[j] = dp[j-1] + dp[j-2];
		}
		
		
		return dp[i];
	}
}
