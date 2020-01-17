package level_one;

// 문자열 다루기 기본
public class Test12 {

	public static void main(String[] args) {
		boolean result;

		String paramStr = "123e";

		result = solution(paramStr);
	}

	public static boolean solution(String s) {
	      boolean answer = true;

	      if ( (s.length() != 4 && s.length() != 6) || 
	    		  (!s.toLowerCase().equals(s) || !s.toUpperCase().equals(s)) ) return false;

	      return answer;
	}
}