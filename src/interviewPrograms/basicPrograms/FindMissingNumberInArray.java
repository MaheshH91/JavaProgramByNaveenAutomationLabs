package interviewPrograms.basicPrograms;

public class FindMissingNumberInArray {

	public static int findMissingNum(int num[], int totalCount) {
		int expSum = totalCount * (totalCount + 1) / 2;
		int actSum = 0;
		for (int i : num) {
			actSum += i;
		}
		return expSum - actSum;
	}

	public static void main(String[] args) {
		// 1 2 3 4 5 ......100

		int num[] = { 1, 2, 3, 5 };
		System.out.println(findMissingNum(num, 5));
	}

}
