package level_one;

import java.util.stream.Stream;

// 이상한 문자 만들기
public class Test19 {
	public static void main(String[] args) {
		String result;
		String paramS = "try hello world";

		result = solution(paramS);
	}

	public static String solution(String s) {
		String answer = "";
		int idx = 0;

		for (int i = 0; i < s.length(); i++) {
			
			if (s.substring(i, i+1).equals(" ")) {
				idx = 0;
				answer += " ";
				continue;
			}

			if (idx % 2 == 0) {
				answer += s.substring(i, i+1).toUpperCase();

			} else {
				answer += s.substring(i, i+1).toLowerCase();

			}

			idx++;
		}

		return answer;
	}
}