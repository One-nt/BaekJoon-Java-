import java.io.BufferedReader;
import java.io.InputStreamReader;

public class sol_11444 {
	final static long MOD = 1000000007;
	public static long[][] oddMat = {{1, 1}, {1, 0}};
	
	public static void main(String[] args) throws Exception {
		//scanner와 유사하나 많은 양의 데이터를 계산하기 위해 bufferedReader 사용.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long num = Long.parseLong(br.readLine());		
		
		//기본적인 피보니치 수열 행렬
		long[][] mat = {{1, 1}, {1, 0}};
		
		//원하는 값을 구하려면 지수-1값을 계산하고 행렬의 (0, 0) 자리값을 출력
		System.out.println(fib(mat, num - 1)[0][0]);
		
	}
	
	
	//행렬로 피보나치 수열 계산
	public static long[][] fib(long[][] arr, long exp) {
		//지수가 1이하면 arr 그대로 return
		if(exp <= 1)
			return arr;
		
		//계산을 간단히 하기 위한 재귀호출
		long[][] re = fib(arr, exp/2);
		
		//지수가 홀수든 짝수든 상관없이 재귀호출값을 곱하기.
		re = multi(re, re);
		
		//만약 지수가 홀수라면 지수가 1인 행렬을 한 번 더 곱하기
		if(exp % 2 == 1) {
			re = multi(re, oddMat);
		}
		
		
		return re;
	}
	
	
	//행렬 곱하기 계산
	public static long[][] multi(long[][] m1, long[][] m2) {
		//계산 결과를 저장할 행렬
		long[][] result = new long[2][2];
		
		//곱하기 계산을 하고 조건에서 요구한 것처럼 MOD값만큼 나눠서 나머지만 저장
		result[0][0] = ((m1[0][0] * m2[0][0] + m1[0][1] * m2[1][0])) % MOD;
		result[0][1] = ((m1[0][0] * m2[1][0] + m1[0][1] * m2[1][1])) % MOD;
		result[1][0] = ((m1[1][0] * m2[0][0] + m1[1][1] * m2[1][0])) % MOD;
		result[1][1] = ((m1[1][0] * m2[1][0] + m1[1][1] * m2[1][1])) % MOD;
		
		return result;
	}
}
