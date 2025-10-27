package interviewPrograms;

public class RemoveJunks {
	public static void main(String[] args) {
		String string = "こんにちは、世界Latin String @0123456789";
		String string2 = "Hello@# World!! 123$%^";
		//Regular Expression [^a-zA-Z0-9]
		string = string.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(string);
		string2 = string2.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(string2);
	}
}
