package level_one;

import java.util.*;

// 2016년
public class Test05 {

	public static void main(String[] args) {
		String result;

		int paramMonth = 5;
		int paramDay = 24;

		result = solution(paramMonth, paramDay);
	}

	public static String solution(int a, int b) {
		String answer = "";

		String[] weekDay = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
		int[] daysCnt = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		int flagCnt = 0;
		int totalDays = 0;

		for (int i : daysCnt) {

			flagCnt++;
			if (flagCnt == a) {
				totalDays += (b-1);
				break;
			}

			totalDays += i;
		}

		answer = weekDay[totalDays % 7];

		return answer;
	}
}