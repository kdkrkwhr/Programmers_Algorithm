package level_one;

// 수박수박수박수박수박수?
public class Test15 {

	public static void main(String[] args) {
		String result;

		int paramN = 12;

		result = solution(paramN);
	}

	public static String solution(int n) {
		String answer = "";
		String subak = "수박";

		for (int i = 0; i < n; i++) {
			answer += subak.substring(i%2, (i%2)+1);
		}

		return answer;
	}
}