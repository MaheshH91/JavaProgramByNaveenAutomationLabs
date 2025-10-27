package interviewPrograms;

import java.util.Arrays;

public class SmallestAndLargestNumberFromArray {

	public static void main(String[] args) {

		int numbers[] = { -10, 24, 50, -88, 987656, 0, 987657 };

		int smallest = numbers[0];
		int largest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			} else if (numbers[i] < smallest) {
				smallest = numbers[i];
			}

		}

		System.out.println("\nGiven array: " + Arrays.toString(numbers));
		System.out.println("Largest number is: " + largest);
		System.out.println("Smallest number is: " + smallest);
	}

}
