package level_one;

import java.util.Arrays;

// 나누어 떨어지는 숫자 배열
public class Test08 {

	public static void main(String[] args) {
		int[] result;
		int[] paramA = {5, 9, 7, 10};
		int paramB = 5;

		result = solution(paramA, paramB);
	}

	public static int[] solution(int[] arr, int divisor) {
		int[] answer = {};
		int arrSize = 0;
		int idx = 0;

		for (int i : arr) {			
			if (i % divisor == 0) arrSize++;
		}

		answer = new int[arrSize];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				answer[idx] = arr[i];
				idx++; 
			}
		}

		Arrays.sort(answer);

		if (answer.length == 0) {
			answer = new int[1];
			answer[0] = -1;
		}

		return answer;
	}
}