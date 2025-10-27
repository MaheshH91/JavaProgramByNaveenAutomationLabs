package arrayQuestions;

import java.util.ArrayList;
import java.util.List;

public class StartsWithOne {

	public static List<Integer> findNumbersStartingWithOne(int[] arr) {
		List<Integer> result = new ArrayList<>();

		for (int num : arr) {
			if (String.valueOf(num).startsWith("1")) {
				result.add(num);
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 123, 456, 198, 145, 201, 1, 999, 1000 };

		List<Integer> startingWithOne = findNumbersStartingWithOne(arr);
		System.out.println("Numbers starting with 1: " + startingWithOne);
	}
}
