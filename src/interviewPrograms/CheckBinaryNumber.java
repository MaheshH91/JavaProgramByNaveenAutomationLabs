package interviewPrograms;


public class CheckBinaryNumber {

    public static boolean isBinary(String input) {
        return input.matches("[01]+");
    }

    public static void main(String[] args) {
        String[] testInputs = {"1010", "110011", "1234", "abc101", "0001"};

        for (String input : testInputs) {
            if (isBinary(input)) {
                System.out.println(input + " is a valid binary number.");
            } else {
                System.out.println(input + " is NOT a valid binary number.");
            }
        }
    }
}
