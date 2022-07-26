import java.util.Scanner;

public class sol_2293 {
	public static int[] cas; 
	public static int[] rec; 
	public static int cnt = 0;
	
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);	
		
		int num = s.nextInt();
		int total = s.nextInt();
		
		//동전의 가치 저장
		cas = new int[num + 1];	
		//각 총액마다의 가지수 저
		rec = new int[total + 1];
		
		rec[0] = 1;
		
		for (int i = 1; i <= num; i++) {
			cas[i] = s.nextInt();
			for (int j = cas[i]; j <= total; j++)
				rec[j] += rec[j - cas[i]];
		}
			
		
		System.out.println(rec[total]);
		
				
	}
}
