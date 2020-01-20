package level_one;

// 문자열을 정수로 바꾸기
public class Test16 {

	public static void main(String[] args) {
		int result;

		String paramS = "1234";

		result = solution(paramS);
	}

	public static int solution(String s) {
		return Integer.parseInt(s);
	}
}