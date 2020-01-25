package level_one;

// 약수의 합
public class Test18 {
	public static void main(String[] args) {
		int result;
		int paramN = 3;

		result = solution(paramN);
	}

	public static int solution(int n) {
		int answer = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) answer += i;
		}

		return answer;
	}
}