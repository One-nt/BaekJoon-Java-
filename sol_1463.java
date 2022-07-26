import java.util.Scanner;

public class sol_1463 {
public static Integer[] dp;		
	
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		
		int total = s.nextInt();		
		dp = new Integer[total + 1];		
		
		dp[0] = dp[1] = 0;
		
		
		
		System.out.println(DP(total));
		
				
	}
	
	public static int DP(int i) {
		
		if (dp[i] == null) {
			
			if(i % 6 == 0)
				dp[i] = Math.min(DP(i - 1), Math.min(DP(i / 3), DP(i / 2))) + 1;
			
			else if (i % 3 == 0)
				dp[i] = Math.min(DP(i / 3), DP(i - 1)) + 1;
			
			
			else if (i % 2 == 0)
				dp[i] = Math.min(DP(i / 2), DP(i - 1)) + 1;
			
			else 
				dp[i] = DP(i - 1) + 1;
		
		
			
			
		
		}
			
			return dp[i];
		
		}
	
}
