package level_one;

import java.util.*;

// 문자열 내 마음대로 정렬하기
public class Test10 {

	public static void main(String[] args) {
		String[] result;

		String[] paramStrings = { "sun", "bed", "car" };
		int paramN = 1;

		result = solution(paramStrings, paramN);
	}

	public static String[] solution(String[] strings, int n) {
		String[] answer = {};

		int forIndex = 0;
		List<String> strList = new ArrayList();

		for (String str : strings) {
			strList.add(str.charAt(n)+strings[forIndex]);
			forIndex++;
		}

		Collections.sort(strList);
		answer = new String[strList.size()];

		for (int i = 0; i < strList.size(); i++) {
			answer[i] = strList.get(i).substring(1, strList.get(i).length());
		}

		return answer;
	}
}