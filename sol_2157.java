import java.util.Arrays;
import java.util.Scanner;

public class sol_2157 {
	public static int[][] dp;	
	public static int[][] edge;
	public static int m;
	public static final int INVALID = -1;
	
	
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		m = s.nextInt();
		int k = s.nextInt();
		
		dp = new int[n+1][m+1];					
		edge = new int[n+1][n+1];
		
		for (int[] row : edge) Arrays.fill(row, INVALID);
		
		for (int i = 0; i < k; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			
			if(a > b)
				continue;
			
			edge[a][b] = Math.max(edge[a][b], c);
		}
		
		for (int[] row : dp) Arrays.fill(row, INVALID);
        dp[1][1] = 0;
        for (int curCity = 1; curCity < n; curCity++) {
            for (int arrivedCnt = 1; arrivedCnt < m; arrivedCnt++) {
                if (dp[curCity][arrivedCnt] == INVALID) continue;

                for (int nextCity = curCity+1; nextCity <= n; nextCity++) {
                    if (edge[curCity][nextCity] == INVALID) continue;
                    dp[nextCity][arrivedCnt+1] = Math.max(dp[nextCity][arrivedCnt+1], dp[curCity][arrivedCnt] + edge[curCity][nextCity]);
                }
            }
        }

        System.out.println(Arrays.stream(dp[n]).max().getAsInt());

	}
	
}
