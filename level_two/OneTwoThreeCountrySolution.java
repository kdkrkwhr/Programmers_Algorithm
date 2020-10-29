package level_two;

// 124 나라의 숫자
public class OneTwoThreeCountrySolution {

  public static void main(String[] args) {
    int n = 10;

    String result = solution(n);
    System.out.println("resulr : " + result);
  }

  public static String solution(int n) {
    String answer = "";
    String[] standards = {"4", "1", "2"};

    while (n > 0) {
      answer = standards[n % 3] + answer;
      n = (n - 1) / 3;
    }

    return answer;
  }
}
