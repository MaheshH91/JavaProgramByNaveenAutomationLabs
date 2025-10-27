package collectionsPrograms.linkedHashsetprograms;

import java.util.*;

public class HashSetInterviewPrograms {

    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>(Arrays.asList("apple", "banana", "grape", "orange"));
        HashSet<String> set2 = new HashSet<>(Arrays.asList("banana", "kiwi", "apple"));

        System.out.println("1. Add and Iterate:");
        addAndIterate();

        System.out.println("\n2. Remove Duplicates from List:");
        List<String> listWithDuplicates = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        System.out.println(removeDuplicates(listWithDuplicates));

        System.out.println("\n3. Contains 'grape': " + containsElement(set1, "grape"));

        System.out.println("\n4. Compare Sets: " + compareSets(set1, set2));

        System.out.println("\n5. Common Elements: " + findCommon(new HashSet<>(set1), new HashSet<>(set2)));

        System.out.println("\n6. Set to Array: " + Arrays.toString(setToArray(set1)));

        System.out.println("\n7. Array to Set: " + arrayToSet(new String[]{"one", "two", "three"}));

        System.out.println("\n8. Remove 'banana':");
        HashSet<String> modSet = new HashSet<>(set1);
        removeElement(modSet, "banana");
        System.out.println(modSet);

        System.out.println("\n9. Clear Set:");
        HashSet<String> clearSet = new HashSet<>(set1);
        clearSet(clearSet);
        System.out.println("Is set empty after clear? " + clearSet.isEmpty());

        System.out.println("\n10. Is Set Empty: " + isEmpty(new HashSet<>()));
    }

    public static void addAndIterate() {
        HashSet<String> set = new HashSet<>();
        set.add("Selenium");
        set.add("Java");
        set.add("TestNG");

        for (String item : set) {
            System.out.println(item);
        }
    }

    public static List<String> removeDuplicates(List<String> list) {
        return new ArrayList<>(new HashSet<>(list));
    }

    public static boolean containsElement(HashSet<String> set, String value) {
        return set.contains(value);
    }

    public static boolean compareSets(HashSet<String> set1, HashSet<String> set2) {
        return set1.equals(set2);
    }

    public static Set<String> findCommon(HashSet<String> set1, HashSet<String> set2) {
        set1.retainAll(set2);
        return set1;
    }

    public static String[] setToArray(HashSet<String> set) {
        return set.toArray(new String[0]);
    }

    public static HashSet<String> arrayToSet(String[] array) {
        return new HashSet<>(Arrays.asList(array));
    }

    public static void removeElement(HashSet<String> set, String value) {
        set.remove(value);
    }

    public static void clearSet(HashSet<String> set) {
        set.clear();
    }

    public static boolean isEmpty(HashSet<String> set) {
        return set.isEmpty();
    }
}