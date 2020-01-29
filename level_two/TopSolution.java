package level_two;

import java.util.*;

// 탑
public class TopSolution {

	public static void main(String[] args) {
		int[] result;
		int[] paramStr = { 6, 9, 5, 7, 4 };

		result = solution(paramStr);
		for (int i : result) {
			System.out.println(i);
		}
	}

	public static int[] solution(int[] heights) {
		int[] answer;

		answer = new int[heights.length];

		for (int i = heights.length; i > 0; i--) {
			for (int j = 0; j < i - 1; j++) {
				if (heights[j] > heights[i - 1]) answer[i - 1] = j + 1;

			}
		}

		return answer;
	}
}