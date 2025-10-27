package interviewPrograms.basicPrograms;

class ArmstrongNumber2 {
	public static boolean isArmstrong(int number) {
		int original = number;

		int digits = String.valueOf(number).length();
		int sum = 0;

		while (number > 0) {
			int digit = number % 10;
			sum += Math.pow(digit, digits);
			number /= 10;
		}

		return sum == original;
	}

	public static void main(String[] args) {
		int[] testNumbers = { 153, 9474, 370, 123, 407 };

		for (int num : testNumbers) {
			if (isArmstrong(num)) {
				System.out.println(num + " is an Armstrong/Narcissistic number.");
			} else {
				System.out.println(num + " is NOT an Armstrong number.");
			}
		}
	}

}