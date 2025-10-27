
package interviewPrograms.basicPrograms;

import java.util.Arrays;
import java.util.stream.Stream;

public class Join2Arrays {

	public static void main(String[] args) {
		String[] batsmen = { "Rohit", "Virat", "Dhawan", "Shreyas", "Rishabh", "Shubhman" };

		String[] bowlers = { "Hardik", "Bhuvi", "Bumrah", "Chahal", "Jaddu" };

		// Method 1: Using Arrays.copyOf and System.arraycopy
		String[] team1 = new String[batsmen.length + bowlers.length];
		System.arraycopy(batsmen, 0, team1, 0, batsmen.length);
		System.arraycopy(bowlers, 0, team1, batsmen.length, bowlers.length);
		System.out.println("Using System.arraycopy: " + Arrays.toString(team1));

		// Method 2: Using Java 8 Streams
		String[] team2 = Stream.concat(Arrays.stream(batsmen), Arrays.stream(bowlers)).toArray(String[]::new);
		System.out.println("Using Java 8 Streams: " + Arrays.toString(team2));

		// Method 3: Using List and addAll
		java.util.List<String> teamList = new java.util.ArrayList<>();
		teamList.addAll(Arrays.asList(batsmen));
		teamList.addAll(Arrays.asList(bowlers));
		String[] team3 = teamList.toArray(new String[0]);
		System.out.println("Using List addAll: " + Arrays.toString(team3));
	}
}
