import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class sol_1181 {
	public static String[] arr;
	public static int num;
	
	
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);	
	
		num = s.nextInt();
		
		arr = new String[num];
		
		for (int i = 0; i < num ; i++)
			arr[i] = s.next();
		
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String a1, String a2) {
				if (a1.length() == a2.length()) {
					return a1.compareTo(a2);
				}
				
				else
					return a1.length() - a2.length();  
			}
		});
		
		System.out.println(arr[0]);
		
		for(int i = 1; i < num; i++) {
			if(!arr[i].equals(arr[i-1]))
				System.out.println(arr[i]);
		}
			
		
		
		
	}
		 

	} 

