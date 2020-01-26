package level_one;

import java.util.stream.Stream;

// 자릿수 더하기
public class Test20 {
	public static void main(String[] args) {
		int result;
		int paramN = 523;

		result = solution(paramN);
	}

    public static int solution(int n) {
        int answer = 0;

        for (int i = 0; i < Integer.toString(n).length(); i++) {
        	answer += Integer.parseInt(Integer.toString(n).substring(i, i+1));
        }

        return answer;
    }
}