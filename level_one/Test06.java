package level_one;

// 가운데 글자 가져오기
public class Test06 {

	public static void main(String[] args) {
		String result;
		String paramStr = "가나다라";

		result = solution(paramStr);
	}

	public static String solution(String s) {
		String answer = "";

		int strLength = s.length();
		int diffNum = 0;

		if (strLength % 2 == 0) diffNum--;

		answer = s.substring(strLength / 2 + diffNum, (strLength / 2) + 1);

		return answer;
	}
}