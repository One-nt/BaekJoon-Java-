import java.util.Scanner;

public class sol_12865 {
	public static int[][] dp;
	public static int[][] arr;
	public static int cnt = 0;
	public static int val = 0;	
	
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		
		cnt = s.nextInt();
		val = s.nextInt();
		
		dp = new int[cnt][val + 1];		
		arr = new int[cnt][2];
		
		for (int i = 0; i < cnt; i++) {
			arr[i][0] = s.nextInt();
			arr[i][1] = s.nextInt();
		}
		
		System.out.print(lis(cnt - 1, val));
				
	}
	
	
	
	public static int lis(int i, int k) {
		if(i < 0)
			return 0;
		
		if (dp[i][k] == 0) {
			if (arr[i][0] > k)
				dp[i][k] = lis(i-1, k);
			
			else
				dp[i][k] = Math.max(lis(i-1, k), lis(i-1, k - arr[i][0]) + arr[i][1]);
				
		}
		
		return dp[i][k];
	}
}
