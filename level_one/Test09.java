package level_one;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 문자열 내림차순으로 배치하기
public class Test09 {

	public static void main(String[] args) {
		String result;
		String paramA = "Zbcdefg";

		result = solution(paramA);
	}

	public static String solution(String s) {
		String answer = "";
		Stream<String> streamStr;

		streamStr = Stream.of(s.split("")); // 자른 문자열 Stream 삽입
		streamStr = streamStr.sorted(Comparator.reverseOrder()); // Comparator.reverseOrder() ==> 내림차순
		answer = streamStr.collect(Collectors.joining("")); // 문자 재조합

		return answer;
	}
}