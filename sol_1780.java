import java.util.Scanner;

public class sol_1780 {
	public static int[][] arr;
	public static int minus = 0;
	public static int zero = 0;
	public static int one = 0;
	
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		
		int size = s.nextInt();
		
		//행렬 크기 설정
		arr = new int[size][size];
		
		//행렬 입력
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		
		
		//처음 사이즈부터 검사 및 분할
		part(0, 0, size);
		
		System.out.println(minus);
		System.out.println(zero);
		System.out.println(one);
		
	}
	
	
	//행렬 자르기
	 public static void part(int row, int col, int size) {
		 //같은 수로 되어있다면 카운트하기 
		 if(check(row, col, size)) {
			 if(arr[row][col] == -1) {				 
				 minus++;
			 }				
			 
			 else if (arr[row][col] == 0)
				 zero++;
			 
			 else
				 one++;
			 
			 return;
		 }
		 
		 
		 //9등분 후, 크기 초기화
		 size /= 3;
		 
		 part(row, col, size); 
		 part(row, col + size, size);
		 part(row, col + size*2, size);
		 
		 part(row + size, col, size);
		 part(row + size, col + size, size);
		 part(row + size, col + size * 2, size);
		 
		 part(row + size * 2, col, size);
		 part(row + size * 2, col + size, size);
		 part(row + size * 2, col + size * 2, size);		 
		 
	 }
	 
	 //같은 수로 되어있는지 확인하기
	 public static boolean check(int row, int col, int size) {
		 int num = arr[row][col];
		 
		 for (int i = row; i < row + size; i++) {
			 for (int j = col; j < col + size; j++) {				 
				 if (num != arr[i][j])
					 return false;
			 }
		 }
		 
		 return true;
	 }
}
