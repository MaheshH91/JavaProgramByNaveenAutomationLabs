package interviewPrograms.basicPrograms.opp;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateElements {

    public static void main(String[] args) {
        String[] infra = {
        		"Amazon", "GCP", "Azure", "Amazon", "Ali Baba", "SauceLabs",
                "Azure", "GCP", "C", "Java", "C", "Java"

        };

        // 1. Brute Force
        System.out.println("***** Brute Force *****");
        for (int i = 0; i < infra.length; i++) {
            for (int j = i + 1; j < infra.length; j++) {
                if (infra[i].equals(infra[j])) {
                    System.out.println(infra[i]);
                    break; // Avoid printing same duplicate multiple times
                }
            }
        }

        // 2. HashSet
        System.out.println("***** HashSet *****");
        Set<String> seen = new HashSet<>();
        for (String e : infra) {
            if (!seen.add(e)) {
                System.out.println(e);
            }
        }

        // 3️. HashMap
        System.out.println("***** HashMap *****");
        Map<String, Integer> infraMap = new HashMap<>();
        for (String e : infra) {
            infraMap.put(e, infraMap.getOrDefault(e, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : infraMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }

        // 4️. Streams with HashSet
        System.out.println("***** Streams with HashSet *****");
        Set<String> dupSet = new HashSet<>();
        Arrays.stream(infra)
              .filter(e -> !dupSet.add(e))
              .distinct()
              .forEach(System.out::println);

        // 5️. Streams with groupingBy
        System.out.println("***** Streams groupingBy *****");
        Set<String> groupedDuplicates = Arrays.stream(infra)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet().stream()
            .filter(e -> e.getValue() > 1)
            .map(Map.Entry::getKey)
            .collect(Collectors.toSet());
        System.out.println(groupedDuplicates);

        // 6️. Streams with Collections.frequency
        System.out.println("***** Streams using frequency *****");
        List<String> list = Arrays.asList(infra);
        Set<String> freqDuplicates = list.stream()
            .filter(e -> Collections.frequency(list, e) > 1)
            .collect(Collectors.toSet());
        System.out.println(freqDuplicates);
    }
}