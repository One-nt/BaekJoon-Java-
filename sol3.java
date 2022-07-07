import java.util.Scanner;

public class sol3 {
	public static int[] arr = new int[10];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);			
		
		for (int i = 0; i < 10; i++) {
			arr[i] = scan.nextInt();				
		}	
		
		for (int i = 0; i < 10; i++) {			
			arr[i] = arr[i] % 42;			
		}
		
		int cnt = 0;
		boolean lap = false;
		
		for (int i = 0; i < 10; i++) {
			lap = false;
			for (int j = i + 1; j < 10; j++) {
				if (arr[i] == arr[j]) {
					lap = true;
					break;	
				}
									
			}
			
			if (lap == false) {
				cnt++;
			}
				
		}
		
		System.out.println(cnt);
		
	
		
		
		
	}
}
