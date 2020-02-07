package level_two;

import java.util.*;

// 쇠막대기
public class IronRodSolution {

	public static void main(String[] args) {
		int result;
		String paramArrangement = "()(((()())(())()))(())";

		result = solution(paramArrangement);
	}

	public static int solution(String arrangement) {
		int answer = 0;

		Stack<Character> rod = new Stack<Character>();

		for (int i = 0; i < arrangement.length(); i++) {
			if (arrangement.charAt(i) == ')') {
				rod.pop();

			} else {
				rod.add(arrangement.charAt(i));

				if (arrangement.charAt(i - 1) == '(') {
					answer += rod.size();

				} else {
					answer++;

				}
			}
		}

		return answer;
	}
}