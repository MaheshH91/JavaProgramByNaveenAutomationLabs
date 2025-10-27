package interviewPrograms.basicPrograms.opp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		// Creating an ArrayList of TV series
		ArrayList<String> tvSeries = new ArrayList<String>();
		tvSeries.add("Game of Thrones");
		tvSeries.add("Breaking Bad");
		tvSeries.add("The Big Bang Theory");
		tvSeries.add("The Walking Dead");
		tvSeries.add("Prison Break");

		// 1. Using Java 8 forEach loop with lambda expression
		System.out.println("===Using Java 8 forEach and Lambda===");
		tvSeries.forEach(shows -> System.out.println(shows));

		// 2. Using Iterator (classic approach)
		System.out.println("\n===Using Iterator===");
		Iterator<String> itr = tvSeries.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// 3. Using Iterator with Java 8 forEachRemaining() method
		System.out.println("\n===Using Iterator and Java 8 forEachRemaining()===");
		itr = tvSeries.iterator(); // Resetting iterator
		itr.forEachRemaining(show -> System.out.println(show));

		// 4. Using enhanced for-each loop
		System.out.println("\n===Using Enhanced For-Each Loop===");
		for (String str : tvSeries) {
			System.out.println(str);
		}

		// 5. Using traditional for loop with index
		System.out.println("\n===Using For Loop with Index===");
		for (int i = 0; i < tvSeries.size(); i++) {
			System.out.println((i + 1) + ". " + tvSeries.get(i)); // Showing order
		}

		// 6. Using ListIterator to traverse in both directions
		System.out.println("\n===Using ListIterator in Reverse===");
		ListIterator<String> tvSerieslistIterator = tvSeries.listIterator(tvSeries.size());
		while (tvSerieslistIterator.hasPrevious()) {
			String show = tvSerieslistIterator.previous();
			System.out.println(show);
		}

		System.out.println("\n===Using ListIterator Forward Again===");
		while (tvSerieslistIterator.hasNext()) {
			String show = tvSerieslistIterator.next();
			System.out.println(show);
		}
	}
}