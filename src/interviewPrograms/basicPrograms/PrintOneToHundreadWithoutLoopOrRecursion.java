package interviewPrograms.basicPrograms;

import java.util.stream.IntStream;

public class PrintOneToHundreadWithoutLoopOrRecursion {

	public static void main(String[] args) {
		/**
		* Output numbers from 1 ... 100
		* without using any numbers in your code.
		*/

		  IntStream.rangeClosed(1, 100)
          .forEach(System.out::println);

	}

}
