import java.util.Scanner;

public class sol2 {
	public static double[] arr;
	public static double max;	
	public static double sum = 0;


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int cas = scan.nextInt();
		
		arr = new double[cas];
		
		for (int i = 0; i < cas; i++) {
			arr[i] = scan.nextDouble();				
		}
		
		max = arr[0];
		
		for (int i = 1 ; i < cas; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}	
		
		for (int i = 0; i < cas; i++) {			
			sum += arr[i] / max * 100;		
		}
		
		double aver = sum / cas;
		System.out.println(aver);
		
	}
}
