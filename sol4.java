import java.util.Scanner;

public class sol4 {
	public static String[] arr = new String[50];
	public static int[] numCnt = new int[10];

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);		
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		int num = a * b * c;
		
		String str = Integer.toString(num);
		arr = str.split("");
		
		for(int i = 0; i < str.length(); i++) {
			switch(arr[i]) {
			case "0": numCnt[0] += 1;
			break;
			
			case "1": numCnt[1] += 1;
			break;
			
			case "2": numCnt[2] += 1;
			break;
			
			case "3": numCnt[3] += 1;
			break;
			
			case "4": numCnt[4] += 1;
			break;
			
			case "5": numCnt[5] += 1;
			break;
			
			case "6": numCnt[6] += 1;
			break;
			
			case "7": numCnt[7] += 1;
			break;
			
			case "8": numCnt[8] += 1;
			break;
			
			case "9": numCnt[9] += 1;
			break;
			
			default: break;	
				
			}
			
			
		}
				
		for (int i = 0; i < 10; i++) {
			System.out.println(numCnt[i]);
		}	
				
		
		
	}
}
