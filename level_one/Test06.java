package level_one;

import java.util.*;

// 같은 숫자는 싫어
public class Test06 {

	public static void main(String[] args) {
		int[] result;
		int[] paramArr = { 1, 1, 3, 3, 0, 1, 1 };

		result = solution(paramArr);
	}

	public static int[] solution(int[] arr) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		int idx = 10;
		int[] answer = {};

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != idx) {
				arrList.add(arr[i]);
				idx = arr[i];

			}
		}

		answer = new int[arrList.size()];

		for (int i = 0; i < arrList.size(); i++) {
			answer[i] = arrList.get(i);
		}

		return answer;
	}
}