import java.io.BufferedReader;
import java.io.InputStreamReader;

public class sol_11444 {
	final static long MOD = 1000000007;
	public static long[][] oddMat = {{1, 1}, {1, 0}};
	
	public static void main(String[] args) throws Exception {
		//scanner�� �����ϳ� ���� ���� �����͸� ����ϱ� ���� bufferedReader ���.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long num = Long.parseLong(br.readLine());		
		
		//�⺻���� �Ǻ���ġ ���� ���
		long[][] mat = {{1, 1}, {1, 0}};
		
		//���ϴ� ���� ���Ϸ��� ����-1���� ����ϰ� ����� (0, 0) �ڸ����� ���
		System.out.println(fib(mat, num - 1)[0][0]);
		
	}
	
	
	//��ķ� �Ǻ���ġ ���� ���
	public static long[][] fib(long[][] arr, long exp) {
		//������ 1���ϸ� arr �״�� return
		if(exp <= 1)
			return arr;
		
		//����� ������ �ϱ� ���� ���ȣ��
		long[][] re = fib(arr, exp/2);
		
		//������ Ȧ���� ¦���� ������� ���ȣ�Ⱚ�� ���ϱ�.
		re = multi(re, re);
		
		//���� ������ Ȧ����� ������ 1�� ����� �� �� �� ���ϱ�
		if(exp % 2 == 1) {
			re = multi(re, oddMat);
		}
		
		
		return re;
	}
	
	
	//��� ���ϱ� ���
	public static long[][] multi(long[][] m1, long[][] m2) {
		//��� ����� ������ ���
		long[][] result = new long[2][2];
		
		//���ϱ� ����� �ϰ� ���ǿ��� �䱸�� ��ó�� MOD����ŭ ������ �������� ����
		result[0][0] = ((m1[0][0] * m2[0][0] + m1[0][1] * m2[1][0])) % MOD;
		result[0][1] = ((m1[0][0] * m2[1][0] + m1[0][1] * m2[1][1])) % MOD;
		result[1][0] = ((m1[1][0] * m2[0][0] + m1[1][1] * m2[1][0])) % MOD;
		result[1][1] = ((m1[1][0] * m2[1][0] + m1[1][1] * m2[1][1])) % MOD;
		
		return result;
	}
}
