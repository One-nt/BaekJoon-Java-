import java.util.Scanner;

public class sol_1427 {
public static String[] arr = new String[50];	
	
	//bubble sort 이용
	
	
	//자리 바꾸기
	public static void swap(String[] arr, int i, int j) {
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;		
	}
	
	//bubble sort
	public static void bubbleSort(String[] arr) {	
		for (int i = arr.length - 1 ; i >= 0; --i) {
			for (int j = 0; j < i; j++) {
				if (arr[j].compareTo(arr[j+1]) < 0)
					swap(arr, j, j+1);
					
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);		
				
		String str = s.next();
		arr = str.split("");
		
		bubbleSort(arr);
		
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i]);
		
		
		
		
		
	}
}
