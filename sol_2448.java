import java.io.BufferedReader;
import java.io.InputStreamReader;

public class sol_2448 {
public static String[] star;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//줄 갯수 입력받기
		int num = Integer.parseInt(br.readLine());
		
		//별 모양을 저장할 배열 
		star = new String[num];
		
		//반복되는 별을 배열에 저장
		star[0] = "  *  ";
		star[1] = " * * ";
		star[2] = "*****";
		
		for (int i = 1; 3 * (int)Math.pow(2, i) <= num; i++)
			make(i, star);
		
		for (int i = 0; i < num; i++)
			System.out.println(star[i]);
			
		
	}
	
	//별 형태를 재귀형식으로 출력 
	public static void make(int i, String[] star) {
		//줄 갯수
		int bottom = 3 * (int)Math.pow(2, i);
		// 재귀를 통해 출력해야 하는 부분
		int middle = bottom / 2;
		
		//재귀(저장된 형태를 한줄씩 공백 하나를 포함하여 출력)
		for (int j = middle; j < bottom; j++) {
			star[j] = star[j-middle] + " " + star[j-middle];
		}
		
		//재귀 출력 이전 부분의 공백을 채워주기
		String space = "";
		
		//재귀 출력한 줄 수만큼 좌우에 공백 채워주기
		for (int j = 0; j < middle; j++)
			space += " ";
		
		for (int j = 0; j < middle; j++)
			star[j] = space + star[j] + space;
	
	}
}
