package interviewPrograms.basicPrograms;

public class GetCharCount {
	public static void main(String[] args) {
		String string= "hello world of java programming.";
		System.out.println(getCharCount(string, 'a'));
		
	}
	public static long getCharCount(String string,char c) {
		long count = string
			.chars()
				.filter(e->(char)e==c)
					.count();
		return count;
	}
}
