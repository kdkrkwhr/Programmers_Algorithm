package level_two;

import java.util.*;

// 프린터
public class PrinterSolution {

	public static void main(String[] ar) {
		int result;
		int[] paramPriorities = { 2, 1, 3, 2 };
		int paramLocation = 2;

		result = solution(paramPriorities, paramLocation);
	}

	public static int solution(int[] priorities, int location) {
		int answer = 0;

		List<Integer> prioList = new ArrayList<Integer>();
		int maxImport, curImport;

		for (int i : priorities) {
			prioList.add(i);
		}

		while (!prioList.isEmpty()) {
			maxImport = prioList.get(0);

			for (int i = 1; i < prioList.size(); i++) {
				if (prioList.get(0) < prioList.get(i)) {
					if (location == 0) {
						location = prioList.size() - 1;

					} else {
						location--;

					}

					curImport = prioList.get(0);
					prioList.remove(0);
					prioList.add(curImport);
					maxImport = 0;
					break;
				}
			}

			if (maxImport != 0) {
				prioList.remove(0);
				answer++;
				if (location == 0) {
					break;

				} else {
					location--;

				}
			}
		}

		return answer;
	}
}
