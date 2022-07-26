import java.util.Scanner;

public class sol_1937 {
	public static int[][] forest;
	public static int[][] dp;
	public static int[][] move = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; 
	public static int total;
	
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		
		total = s.nextInt();
		forest = new int[total][total];
		dp = new int[total][total];		
		
			
		for (int i = 0; i < total; i++) {
			for(int j = 0; j < total; j++) 				
				forest[i][j] = s.nextInt();
		}
		
		for (int i = 0; i < total; i++) {
			for(int j = 0; j < total; j++) {				
				LIS(i, j);
			}


		}
		
		int max = 0;
		
		for (int i = 0; i < total; i++) {
			for(int j = 0; j < total; j++)
				max = Math.max(max, dp[i][j]);			
		}
		
		System.out.println(max);
		
				
	}
	
	public static int LIS(int i, int j) {				
		
		//탐색했는지 확인하기
		if (dp[i][j] == 0)  {
			dp[i][j] = 1;
			
			for (int x = 0; x < 4; x++) {
				int MoveI = i + move[x][0];
				int MoveJ = j + move[x][1];
				if (MoveI >= 0 && MoveI < total && MoveJ >= 0 && MoveJ < total && forest[i][j] < forest[MoveI][MoveJ])
					dp[i][j] = Math.max(dp[i][j], LIS(MoveI, MoveJ) + 1);			
				

			}
			
			
		}	
		
		return dp[i][j];
		
		}
}
