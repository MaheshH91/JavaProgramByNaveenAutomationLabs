package interviewPrograms;

public class ReverseNumberWithRecurssion {

	public static void rev(int number) {
		
		if(number<10) {
			System.out.println(number);
		}
		else {
			System.out.print(number%10);
			rev(number/10);
		}
	}
	public static void main(String[] args) {

		rev(12345);
		rev(123);
		rev(5);
		rev(111);
		

	}
}
