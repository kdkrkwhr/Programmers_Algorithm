package level_two;

// 주식가격
public class StockSolution {

  public static void main(String[] args) {
    int[] prices = {1, 2, 3, 2, 3};

    int[] result = solution(prices);
  }

  public static int[] solution(int[] prices) {
    int[] answer = new int[prices.length];
    int savePrice = 0;
    int currentPrice = 0;

    for (int i = 0; i < prices.length; i++) {
      savePrice = prices[i];
      for (int j = (i + 1); j < prices.length; j++) {
        currentPrice = prices[j];
        if (savePrice <= currentPrice)
          answer[i]++;
        else {
          answer[i]++;
          break;
        }
      }
    }

    return answer;
  }
}
