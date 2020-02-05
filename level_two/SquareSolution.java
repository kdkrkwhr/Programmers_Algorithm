package level_two;

import java.util.*;

// 멀쩡한 사각형
public class SquareSolution {

	public static void main(String[] args) {
		long result;

		int paramW = 8;
		int paramH = 12;

		result = solution(paramW, paramH);
	}

	public static long solution(int w, int h) {
		long answer = 1;

		long longParamW, longParamH, width, next, diffCnt;
		double slope;

		longParamW = (long) w;
		longParamH = (long) h;

		width = longParamW * longParamH;

		if (longParamH == longParamW) {
			return width - longParamW;

		} else if (longParamH > longParamW) {
			next = longParamH;
			longParamH = longParamW;
			longParamW = next;

		}

		slope = (double) longParamH / longParamW;

		diffCnt = 0;

		for (int i = 1; i <= longParamW; i++) {
			if ( (Math.floor(slope * (i - 1)) == Math.floor(slope * i)) 
					|| (Math.ceil(slope * (i - 1)) == Math.ceil(slope * i)) ) {
				diffCnt += 1;

			} else {
				diffCnt += 2;

			}
		}

		answer = width - diffCnt;

		return answer;
	}
}