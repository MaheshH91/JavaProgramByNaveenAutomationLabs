package interviewPrograms.basicPrograms;

import java.util.Arrays;

//Why password should be stored in char array char[] instead of string?
public class PasswordStore {

	public static void main(String[] args) {

		String pwd = "Naveen123";
		System.out.println("pwd is: " + pwd);

		char c[] = new char[] { 'N', 'a', 'v', 'e', 'e', 'n', '1', '2', '3' };
		System.out.println("PWD is: " + c);
		Arrays.fill(c, '*');
		for (char c1 : c) {
			System.out.print(c1);
		}

	}
}
