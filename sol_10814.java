import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class sol_10814 {
	public static String[][] user;
	public static int num;
	
	/*
	public static void swap(String[][] arr, int i, int j) {
		String[] temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;		
	}
	
	*/

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);	
	
		num = s.nextInt();
		
		user = new String[num][2];
		
		for(int i = 0; i < num; i++) {
			user[i][0] = s.next();
			user[i][1] = s.next();
		}
		
		/*
		for (int i = num - 1; i >= 0; --i) {
			for (int j = 0; j < i; j++) {
				int num1 = Integer.parseInt(user[j][0]);
				int num2 = Integer.parseInt(user[j+1][0]);
				
				if(num1 > num2)
					swap(user, j, j+1);
					
			}
		}
		
		*/
		
		Arrays.sort(user, new Comparator<String[]>() {
			// 나이순으로 정렬
			@Override
			public int compare(String[] s1, String[] s2) {
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
			}
			
		});
	
		
		for(int i = 0; i < num; i++)
			System.out.println(user[i][0] + " " + user[i][1]);
		
	}
	
}
