package starPattern;
//  1 2 3 4 5 6 =j
//1 A
//2 B B
//3 C C C
//4 D D D D
//5 E E E E E
//6 F F F F F F
//i
public class AlphabetPattern2 {

	public static void main(String[] args) {
		int alpha=65;
//		int alpha=97;

		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(alpha)+" ");
				
			}
			alpha++;
			System.out.println();
		}
	}

}
