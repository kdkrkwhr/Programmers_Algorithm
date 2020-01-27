package level_one;

import java.util.stream.Stream;

// 자연수 뒤집어 배열로 만들기
public class Test21 {
	public static void main(String[] args) {
		int[] result;
		long paramN = 123456789;

		result = solution(paramN);
	}

	public static int[] solution(long n) {
		int[] answer = {};
		int idx = 0;
		String nStr = Integer.toString((int) n);

		answer = new int[nStr.length()];

		for (int i = nStr.length(); i > 0; i--) {
			answer[idx++] = Integer.parseInt(nStr.substring(i-1, i));
		}

		return answer;
	}
}