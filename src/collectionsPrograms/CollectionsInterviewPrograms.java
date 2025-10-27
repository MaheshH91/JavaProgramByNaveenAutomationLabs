package collectionsPrograms;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionsInterviewPrograms {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");

        System.out.println("1. Remove Duplicates: " + removeDuplicates(list));
        System.out.println("2. Sorted List: " + sortList(new ArrayList<>(list)));
        System.out.println("3. Frequency Count:");
        countFrequency(list).forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println("4. Array to List: " + arrayToList(new String[]{"one", "two", "three"}));
        System.out.println("5. List to Array: " + Arrays.toString(listToArray(list)));
        System.out.println("6. Iterate Map:");
        iterateMap(Map.of("URL", "https://example.com", "Timeout", "30s"));
        System.out.println("7. Common Elements: " + findCommon(new ArrayList<>(list), Arrays.asList("banana", "kiwi", "apple")));
        System.out.println("8. Sorted Map by Value:");
        sortByValue(countFrequency(list)).forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println("9. Contains 'grape': " + containsValue(list, "grape"));
        System.out.println("10. List to Set: " + listToSet(list));
        System.out.println("11. Group by Frequency:");
        groupByFrequency(list).forEach((freq, items) -> System.out.println(freq + ": " + items));
    }

    public static List<String> removeDuplicates(List<String> list) {
        return new ArrayList<>(new HashSet<>(list));
    }

    public static List<String> sortList(List<String> list) {
        Collections.sort(list);
        return list;
    }

    public static Map<String, Integer> countFrequency(List<String> list) {
        Map<String, Integer> freqMap = new HashMap<>();
        for (String item : list) {
            freqMap.put(item, freqMap.getOrDefault(item, 0) + 1);
        }
        return freqMap;
    }

    public static List<String> arrayToList(String[] array) {
        return Arrays.asList(array);
    }

    public static String[] listToArray(List<String> list) {
        return list.toArray(new String[0]);
    }

    public static void iterateMap(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }

    public static List<String> findCommon(List<String> list1, List<String> list2) {
        list1.retainAll(list2);
        return list1;
    }

    public static LinkedHashMap<String, Integer> sortByValue(Map<String, Integer> map) {
        return map.entrySet()
                  .stream()
                  .sorted(Map.Entry.comparingByValue())
                  .collect(Collectors.toMap(
                      Map.Entry::getKey,
                      Map.Entry::getValue,
                      (e1, e2) -> e1,
                      LinkedHashMap::new
                  ));
    }

    public static boolean containsValue(List<String> list, String value) {
        return list.contains(value);
    }

    public static Set<String> listToSet(List<String> list) {
        return new HashSet<>(list);
    }

    public static Map<Integer, List<String>> groupByFrequency(List<String> list) {
        Map<String, Long> freqMap = list.stream()
            .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        return freqMap.entrySet().stream()
            .collect(Collectors.groupingBy(
                e -> e.getValue().intValue(),
                Collectors.mapping(Map.Entry::getKey, Collectors.toList())
            ));
    }
}
