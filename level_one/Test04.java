package level_one;

import java.util.*;

// K번째수
public class Test04 {

	public static void main(String[] args) {
		int[] result;

		int[] paramArray = {1, 5, 2, 6, 3, 7, 4};
		int[][] paramCommands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

		result = solution(paramArray, paramCommands);
	}

    public static int[] solution(int[] array, int[][] commands) {
		int[] result = new int[commands.length];

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < commands.length; i++) {

			for (int j = commands[i][0]-1; j < commands[i][1]; j++) {
				list.add(array[j]);

			}

			Collections.sort(list);

			result[i] = list.get((commands[i][2])-1);
			list.clear();
		}

		return result;
    }
}