import java.io.BufferedReader;
import java.io.InputStreamReader;

public class sol_2448 {
public static String[] star;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//�� ���� �Է¹ޱ�
		int num = Integer.parseInt(br.readLine());
		
		//�� ����� ������ �迭 
		star = new String[num];
		
		//�ݺ��Ǵ� ���� �迭�� ����
		star[0] = "  *  ";
		star[1] = " * * ";
		star[2] = "*****";
		
		for (int i = 1; 3 * (int)Math.pow(2, i) <= num; i++)
			make(i, star);
		
		for (int i = 0; i < num; i++)
			System.out.println(star[i]);
			
		
	}
	
	//�� ���¸� ����������� ��� 
	public static void make(int i, String[] star) {
		//�� ����
		int bottom = 3 * (int)Math.pow(2, i);
		// ��͸� ���� ����ؾ� �ϴ� �κ�
		int middle = bottom / 2;
		
		//���(����� ���¸� ���پ� ���� �ϳ��� �����Ͽ� ���)
		for (int j = middle; j < bottom; j++) {
			star[j] = star[j-middle] + " " + star[j-middle];
		}
		
		//��� ��� ���� �κ��� ������ ä���ֱ�
		String space = "";
		
		//��� ����� �� ����ŭ �¿쿡 ���� ä���ֱ�
		for (int j = 0; j < middle; j++)
			space += " ";
		
		for (int j = 0; j < middle; j++)
			star[j] = space + star[j] + space;
	
	}
}
