package stringQuestions;

public class StringToNumber {

    public static int convertToInt(String str) {
        int result = 0;
        boolean isNegative = false;
        int i = 0;

        // Handle negative numbers
        if (str.charAt(0) == '-') {
            isNegative = true;
            i = 1;
        }

        for (; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9') {
                throw new NumberFormatException("Invalid character: " + ch);
            }
            result = result * 10 + (ch - '0');
        }

        return isNegative ? -result : result;
    }

    public static void main(String[] args) {
        System.out.println(convertToInt("123"));     // 123
        System.out.println(convertToInt("-456"));    // -456
        System.out.println(convertToInt("007"));     // 7
    }
}