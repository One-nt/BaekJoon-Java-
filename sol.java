import java.util.Scanner;

class sol {
	
	public static String[] arr;
	public static int score;		


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int cas = scan.nextInt();
		
		arr = new String[cas];
		
		for (int i = 0; i < cas; i++) {
			arr[i] = scan.next();		
			
		}
		
		for (int i = 0; i < cas; i++) {
			int cnt = 0;
			score = 0;
			
			for (int j = 0; j < arr[i].length(); j++) {
				if(arr[i].charAt(j) == 'O')
					cnt++;
				
				else
					cnt = 0;
				
				score += cnt;
			}
			
			System.out.println(score);
		}
		
		

	}

}
