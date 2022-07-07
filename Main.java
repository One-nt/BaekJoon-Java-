import java.util.Scanner;
import java.io.*;

public class Main {

	public static int[] arr;
	public static int aver;
	public static double per;	

	public static void getAverage(int[] arr) {
		int sum = 0;
		double over = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		aver = sum / arr.length;


		for (int j = 0; j < arr.length; j++) {
			if(arr[j] > aver) {
				over++;
			}
		}

		per = (over / arr.length) * 100;	

	}

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);		
		int cas = scan.nextInt();

		for(int i = 0; i < cas; i++) {
			int num = scan.nextInt();

			arr = new int[num];

			for (int j = 0; j < num; j++) {
				arr[j] = scan.nextInt();
			}

			getAverage(arr);			
			System.out.printf("%.3f", per);
			System.out.println("%");
		}




	}
} 