package other;

import java.util.Scanner;

// 문자열 압축 (Kakao 문제)
public class Kakao01 {
	public static void main(String[] args) {
		String a = "김동기";
		int result = solution(a);

	}

	public static int solution(String s) {
		String bufStr = "";
		String resultStr = "";

		int cnt = 1;
		int strLength = s.length();
		int result = strLength;

		for (int i = 1; i <= s.length() / 2; i++) {
			for (int j = 1; j <= s.length() / i; j++) {
				if (bufStr.equals(s.substring((j - 1) * i, j * i))) {
					cnt++;

				} else {
					if (cnt != 1) {
						resultStr += Integer.toString(cnt);
						cnt = 1;

					}
					resultStr += s.substring((j - 1) * i, j * i);

				}
				bufStr = s.substring((j - 1) * i, j * i);

			}

			if (cnt != 1) {
				resultStr += Integer.toString(cnt);
				cnt = 1;

			}

			if (strLength % i != 0) {
				resultStr += s.substring(strLength - strLength % i, strLength);

			}

			if (resultStr.length() < result) {
				result = resultStr.length();

			}

			resultStr = "";
		}

		return result;
	}

}
