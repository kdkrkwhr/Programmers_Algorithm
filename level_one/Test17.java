package level_one;

// 시저 암호
public class Test17 {
	public static void main(String[] args) {
		String result;

		String paramS = "a B z";
		int paramN = 4;

		result = solution(paramS, paramN);
	}

	public static String solution(String s, int n) {
		String answer = "";
		String anc = "";

		for (int i = 0; i < s.length(); i++) {
			if (s.substring(i, i + 1).equals(" ")) {
				answer += " ";
				continue;
			}

			if (s.substring(i, i + 1).toLowerCase().equals(s.substring(i, i + 1))) {
				anc = Character.toString((char) ((int) (s.charAt(i) + n % 26 - 'a') % 26 + 'a'));

			} else if (s.substring(i, i + 1).toUpperCase().equals(s.substring(i, i + 1))) {
				anc = Character.toString((char) ((int) (s.charAt(i) + n % 26 - 'A') % 26 + 'A'));

			}

			if (anc != "") answer += anc;
		}

		return answer;
	}
}