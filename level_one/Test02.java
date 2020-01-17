package level_one;

// 두 정수 사이의 합
public class Test02 {

	public static void main(String[] args) {
		long result;

		int a = 3;
		int b = 5;

		result = solution(a, b);
	}

	public static long solution(int a, int b) {
		long answer = 0;
		boolean calFlag = false;

		if (a < b) {
			calFlag = true;

		} else if (a > b) {
			calFlag = false;

		} else {
			return a;

		}

		if (calFlag) {
			for (int i = a; i <= b; i++) {
				answer = answer + i;
			}

		} else if (!calFlag) {
			for (int i = b; i <= a; i++) {
				answer = answer + i;

			}

		}

		return answer;
	}
}
