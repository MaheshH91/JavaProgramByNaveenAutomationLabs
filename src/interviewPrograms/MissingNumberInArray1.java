package interviewPrograms;

public class MissingNumberInArray1 {
	public static void main(String[] args) {
		// int arr[] = { 1, 2, 3,4, 5,7};
		// 1+2+4+5 =12
		// 1+2+3+4+5=15
		// 15-14=3

		// 22
		// 28-22=6
		int arr[] = { 1, 2, 4, 5 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);

		int sum1 = 0;
		for (int j = 1; j <= arr.length + 1; j++) {
			sum1 = sum1 + j; // 15
		}

		System.out.println(sum1);

		System.out.println("Missing number is: " + (sum1 - sum));

//		for(int a: arr) {
//			sum+=a;
//		}
//		

	}
}
