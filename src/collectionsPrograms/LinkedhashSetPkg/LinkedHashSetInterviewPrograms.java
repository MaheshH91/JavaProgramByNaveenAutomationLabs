package collectionsPrograms.LinkedhashSetPkg;

import java.util.*;

public class LinkedHashSetInterviewPrograms {

	public static void main(String[] args) {
		LinkedHashSet<String> set1 = new LinkedHashSet<>(Arrays.asList("apple", "banana", "grape", "orange"));
		LinkedHashSet<String> set2 = new LinkedHashSet<>(Arrays.asList("banana", "kiwi", "apple"));

		System.out.println("1. Add and Iterate:");
		addAndIterate();

		System.out.println("\n2. Remove Duplicates from List:");
		List<String> listWithDuplicates = Arrays.asList("apple", "banana", "apple", "orange", "banana");
		System.out.println(removeDuplicates(listWithDuplicates));

		System.out.println("\n3. Contains 'grape': " + containsElement(set1, "grape"));

		System.out.println("\n4. Compare Sets: " + compareSets(set1, set2));

		System.out.println("\n5. Common Elements: " + findCommon(new LinkedHashSet<>(set1), new LinkedHashSet<>(set2)));

		System.out.println("\n6. Set to Array: " + Arrays.toString(setToArray(set1)));

		System.out.println("\n7. Array to Set: " + arrayToSet(new String[] { "one", "two", "three" }));

		System.out.println("\n8. Remove 'banana':");
		LinkedHashSet<String> modSet = new LinkedHashSet<>(set1);
		removeElement(modSet, "banana");
		System.out.println(modSet);

		System.out.println("\n9. Clear Set:");
		LinkedHashSet<String> clearSet = new LinkedHashSet<>(set1);
		clearSet(clearSet);
		System.out.println("Is set empty after clear? " + clearSet.isEmpty());

		System.out.println("\n10. Is Set Empty: " + isEmpty(new LinkedHashSet<>()));
	}

	public static void addAndIterate() {
		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add("Selenium");
		set.add("Java");
		set.add("TestNG");

		for (String item : set) {
			System.out.println(item);
		}
	}

	public static List<String> removeDuplicates(List<String> list) {
		return new ArrayList<>(new LinkedHashSet<>(list));
	}

	public static boolean containsElement(LinkedHashSet<String> set, String value) {
		return set.contains(value);
	}

	public static boolean compareSets(LinkedHashSet<String> set1, LinkedHashSet<String> set2) {
		return set1.equals(set2);
	}

	public static Set<String> findCommon(LinkedHashSet<String> set1, LinkedHashSet<String> set2) {
		set1.retainAll(set2);
		return set1;
	}

	public static String[] setToArray(LinkedHashSet<String> set) {
		return set.toArray(new String[0]);
	}

	public static LinkedHashSet<String> arrayToSet(String[] array) {
		return new LinkedHashSet<>(Arrays.asList(array));
	}

	public static void removeElement(LinkedHashSet<String> set, String value) {
		set.remove(value);
	}

	public static void clearSet(LinkedHashSet<String> set) {
		set.clear();
	}

	public static boolean isEmpty(LinkedHashSet<String> set) {
		return set.isEmpty();
	}
}
