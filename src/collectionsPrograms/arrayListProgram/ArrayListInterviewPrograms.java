package collectionsPrograms.arrayListProgram;

import java.util.*;

public class ArrayListInterviewPrograms {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape"));
		List<String> list2 = new ArrayList<>(Arrays.asList("banana", "kiwi", "apple"));

		System.out.println("1. Add and Iterate:");
		addAndIterate();

		System.out.println("\n2. Remove Duplicates: " + removeDuplicates(list));

		System.out.println("\n3. Sorted List: " + sortArrayList(new ArrayList<>(Arrays.asList(5, 2, 9, 1, 3))));

		System.out.println("\n4. Reversed List: " + reverseArrayList(new ArrayList<>(list)));

		System.out.println("\n5. Compare Lists: " + compareLists(list, list2));

		System.out.println("\n6. Frequency Count:");
		frequencyCount(list).forEach((k, v) -> System.out.println(k + ": " + v));

		System.out.println("\n7. Array to List: " + arrayToList(new String[] { "one", "two", "three" }));
		System.out.println("   List to Array: " + Arrays.toString(listToArray(list)));

		System.out.println("\n8. Remove 'banana':");
		List<String> modList = new ArrayList<>(list);
		removeElement(modList, "banana");
		System.out.println(modList);

		System.out.println("\n9. Contains 'grape': " + containsElement(list, "grape"));

		System.out.println("\n10. Common Elements: " + findCommon(new ArrayList<>(list), list2));
	}

	public static void addAndIterate() {
		ArrayList<String> list = new ArrayList<>();
		list.add("Selenium");
		list.add("Java");
		list.add("TestNG");

		for (String item : list) {
			System.out.println(item);
		}
	}

	public static List<String> removeDuplicates(List<String> list) {
		return new ArrayList<>(new LinkedHashSet<>(list));
	}

	public static List<Integer> sortArrayList(List<Integer> list) {
		Collections.sort(list);
		return list;
	}

	public static List<String> reverseArrayList(List<String> list) {
		Collections.reverse(list);
		return list;
	}

	public static boolean compareLists(List<String> list1, List<String> list2) {
		return list1.equals(list2);
	}

	public static Map<String, Integer> frequencyCount(List<String> list) {
		Map<String, Integer> freqMap = new HashMap<>();
		for (String item : list) {
			freqMap.put(item, freqMap.getOrDefault(item, 0) + 1);
		}
		return freqMap;
	}

	public static String[] listToArray(List<String> list) {
		return list.toArray(new String[0]);
	}

	public static List<String> arrayToList(String[] array) {
		return new ArrayList<>(Arrays.asList(array));
	}

	public static void removeElement(List<String> list, String element) {
		list.remove(element);
	}

	public static boolean containsElement(List<String> list, String element) {
		return list.contains(element);
	}

	public static List<String> findCommon(List<String> list1, List<String> list2) {
		list1.retainAll(list2);
		return list1;
	}
}