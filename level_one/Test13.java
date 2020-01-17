package level_one;

// 서울에서 김서방 찾기
public class Test13 {

	public static void main(String[] args) {
		String result;

		String[] paramStr = {"Jane", "Kim"};

		result = solution(paramStr);
	}

	public static String solution(String[] seoul) {
		String answer = "";

		int idx = 0;
		for (String str : seoul) {
			if (str.equals("Kim")) break;
			idx++;

		}

		answer = "김서방은 " + idx + "에 있다";

		return answer;
	}
}