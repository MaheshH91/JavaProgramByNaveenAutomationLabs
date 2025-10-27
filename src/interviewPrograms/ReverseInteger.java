package interviewPrograms;

public class ReverseInteger {

	public static void main(String[] args) {

		int num = 12345;// 54321
		int revNum = 0;
//1. using algo
		while (num != 0) {
			revNum = revNum * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Reverse Num is: " + revNum);

		// 2. Using StringBuffer method
		long num1 = 123456;
		System.out.print("Reverse Num is: ");
		System.out.print(new StringBuffer(String.valueOf(num1)).reverse());

	}
}
