package starPattern;
//A
//A B
//A B C
//A B C D
//A B C D E
//A B C D E F
public class AlphabetPattern {

	public static void main(String[] args) {
//		int alpha=65;
		int alpha=97;

		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(alpha+j)+" ");
			}
			System.out.println();
			
		}
	}

}
