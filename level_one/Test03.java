package level_one;

import java.util.ArrayList;
import java.util.List;

// 모의고사
public class Test03 {

	public static void main(String[] args) {
		int[] result;

		int[] paramAnswer = {1,2,3,4,5};

		result = solution(paramAnswer);
	}

	public static int[] solution(int[] answers) {
		int[][] playerPattern = { { 1, 2, 3, 4, 5 }, { 2, 1, 2, 3, 2, 4, 2, 5 }, { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 } };

		List<Integer> winList = new ArrayList<>();

		int[] result = {};
		int[] scores = new int[3];

		int maxValue;
		int maxValueSize = 0;

		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == playerPattern[0][i % 5]) {
				scores[0]++;

			}
			if (answers[i] == playerPattern[1][i % 8]) {
				scores[1]++;

			}
			if (answers[i] == playerPattern[2][i % 10]) {
				scores[2]++;

			}
		}

		maxValue = scores[0];
		for (int score : scores) {
			if (score > maxValue) {
				maxValue = score;

			}
		}

		for (int i = 0; i < scores.length; i++) {
			if (maxValue == scores[i]) {
				winList.add(i);
				maxValueSize++;

			}
		}

		result = new int[maxValueSize];
		for (int i = 0; i < result.length; i++) {
			result[i] = winList.get(i) + 1;

		}

		return result;
	}
}