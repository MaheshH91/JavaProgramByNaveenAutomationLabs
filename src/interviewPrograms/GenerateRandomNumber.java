package interviewPrograms;

import java.util.Random;

public class GenerateRandomNumber {

	/*
	 * Generate Random Number in Java 1. Random Class 2. Math. random () 3.
	 * ThreadLocalRandom
	 *
	 * 
	 */

	public static void main(String[] args) {
		// 1. Math.random() -> double between 0.0 and 1.0
		System.out.println("Math.random(): " + Math.random());
		System.out.println("Math.random() scaled to int (0–99): " + (int)(Math.random() * 100));
		// 2. java.util.Random
		Random rand = new Random();
		System.out.println("Random.nextInt(): " + rand.nextInt()); // any int
		System.out.println("Random.nextInt(100): " + rand.nextInt(100));// 0 to 99
		System.out.println("Random.nextDouble(): " + rand.nextDouble());// 0.0 to <1.0

	}
}