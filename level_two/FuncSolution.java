package level_two;

import java.util.*;

// 기능개발
public class FuncSolution {

  public static void main(String[] args) {
    int[] progresses = {93, 30, 55};
    int[] speeds = {1, 30, 5};

    int[] result = solution(progresses, speeds);
  }

  public static int[] solution(int[] progresses, int[] speeds) {
    int[] answer = new int[100];
    int[][] progressBundle = new int[progresses.length][2];
    int day = -1;

    for (int i = 0; i < progresses.length; i++) {
      progressBundle[i][0] = progresses[i];
      progressBundle[i][1] = speeds[i];
    }

    for (int[] prob : progressBundle) {
      while (prob[0] + (day * prob[1]) < 100) {
        day++;
      }
      answer[day]++;
    }

    return Arrays.stream(answer).filter(i -> i != 0).toArray();
  }
}
