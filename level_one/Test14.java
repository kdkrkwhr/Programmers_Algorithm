package level_one;

// 소수 찾기
public class Test14 {

	public static void main(String[] args) {
		int result;

		int paramN = 10;

		result = solution(paramN);
		System.out.println(result);
	}

	public static int solution(int n) {
		int answer = 0;

		int i, j;
		int[] num = new int[n + 1];

		for (i = 2; i <= n; i++) {
			num[i] = i;
		}

		for (i = 2; i <= n; i++) {
			if (num[i] == 0) continue;

			for (j = (i*2); j <= n; j += i) {
				num[j] = 0;
			}
		}

		for (i = 0; i < num.length; i++) {
			if (num[i] != 0) answer++;
		}

		return answer;
	}
}