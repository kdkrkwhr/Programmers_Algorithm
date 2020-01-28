package level_one;

import java.util.*;

// 정수 내림차순으로 배치하기
public class Test22 {
	public static void main(String[] args) {
		long result;
		long paramN = 118372;

		result = solution(paramN);
	}

	public static long solution(long n) {
		long answer = 0;

		String[] arr = (String.valueOf(n)).split("");

		Arrays.sort(arr, Collections.reverseOrder());

		answer = new Long(Integer.parseInt(String.join("", arr)));

		return answer;
	}
}