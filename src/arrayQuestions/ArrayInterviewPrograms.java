package arrayQuestions;

import java.util.*;

public class ArrayInterviewPrograms {

	public static void main(String[] args) {
		int[] arr = { 3, 5, 1, 2, 5, 0, 3, 8 };

		System.out.println("1. Largest Element: " + findLargest(arr));
		System.out.println("2. Reversed Array: " + Arrays.toString(reverseArray(arr.clone())));
		System.out.println("3. Is Sorted: " + isSorted(arr));
		System.out.println("4. Duplicates:");
		findDuplicates(arr);
		System.out.println("5. Frequency Count:");
		frequencyCount(arr);
		System.out.println("6. Bubble Sort: " + Arrays.toString(bubbleSort(arr.clone())));
		System.out.println("7. Second Largest: " + secondLargest(arr));
		System.out.println("8. Merged Arrays: " + Arrays.toString(mergeArrays(arr, new int[] { 9, 10 })));
		System.out.println("9. Move Zeros to End: " + Arrays.toString(moveZerosToEnd(new int[] { 0, 1, 0, 3, 12 })));
		System.out.println("10. Missing Number: " + findMissing(new int[] { 1, 2, 4, 5 }, 5));
	}

	public static int findLargest(int[] arr) {
		int max = arr[0];
		for (int num : arr)
			if (num > max)
				max = num;
		return max;
	}

	public static int[] reverseArray(int[] arr) {
		int left = 0, right = arr.length - 1;
		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		return arr;
	}

	public static boolean isSorted(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1])
				return false;
		}
		return true;
	}

	public static void findDuplicates(int[] arr) {
		Set<Integer> seen = new HashSet<>();
		for (int num : arr) {
			if (!seen.add(num)) {
				System.out.println("Duplicate: " + num);
			}
		}
	}

	public static void frequencyCount(int[] arr) {
		Map<Integer, Integer> freqMap = new HashMap<>();
		for (int num : arr) {
			freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
		}
		freqMap.forEach((key, value) -> System.out.println(key + ": " + value));
	}

	public static int[] bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	public static int secondLargest(int[] arr) {
		int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
		for (int num : arr) {
			if (num > first) {
				second = first;
				first = num;
			} else if (num > second && num != first) {
				second = num;
			}
		}
		return second;
	}

	public static int[] mergeArrays(int[] a, int[] b) {
		int[] merged = new int[a.length + b.length];
		System.arraycopy(a, 0, merged, 0, a.length);
		System.arraycopy(b, 0, merged, a.length, b.length);
		return merged;
	}

	public static int[] moveZerosToEnd(int[] arr) {
		int index = 0;
		for (int num : arr) {
			if (num != 0)
				arr[index++] = num;
		}
		while (index < arr.length)
			arr[index++] = 0;
		return arr;
	}

	public static int findMissing(int[] arr, int n) {
		int total = n * (n + 1) / 2;
		int sum = 0;
		for (int num : arr)
			sum += num;
		return total - sum;
	}
}