package level_one;

// 문자열 내 p와 y의 개수
public class Test11 {

	public static void main(String[] args) {
		boolean result;

		String paramStr = "pPoooyYyY";

		result = solution(paramStr);
	}

	public static boolean solution(String s) {
		boolean answer = true;

		s = s.toLowerCase();

		int pCnt = (int) s.chars().filter(pcnt -> 'p' == pcnt).count();
		int yCnt = (int) s.chars().filter(ycnt -> 'y' == ycnt).count();

		if (pCnt != yCnt) {
			answer = false;
		}

		return answer;
	}
}