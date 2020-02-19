package memo;

import java.util.*;
import java.util.stream.Stream;

public class Solution01 {

	public static void main(String[] arg) {
		String result01;
		boolean result02;

		String paramS = "bcdefgZ";
		int paramX = 12;

		result01 = solution01(paramS);
		result02 = solution02(paramX);
	}

	public static String solution01(String s) {
		String answer = "";

		List<Byte> bb = new ArrayList();

		for (int i = 0; i < s.length(); i++) {
			bb.add((byte) s.charAt(i));
			Collections.sort(bb, Collections.reverseOrder());

		}

		for (byte ss : bb) {
			answer += Character.toString((char) ss);
		}

		return answer;
	}

	public static boolean solution02(int x) {
		boolean answer = true;

		int sum = 0;
		int[] temps = Stream.of(String.valueOf(x).split("")).mapToInt(Integer::parseInt).toArray();

		for (int i = 0; i < temps.length; i++) {
			sum += temps[i];

			if ((i == temps.length-1) && (x % (sum) == 0)) answer = true;
		}

		for (int temp1 : temps) {
			for (int temp2 : temps) {
				if (x % (temp1 + temp2) == 0) {
					answer = true;
					break;
				}
			}
		}

		return answer;
	}
}
