package stringQuestions;

/*
* Check substring is present in a given String
*/


class SubstringCheck {

    public static void main(String[] args) {
        String mainText = "Welcome to Java Programming";
        String subText = "Java";

        // Method 1: Using contains
        if (mainText.contains(subText)) {
            System.out.println("Substring is present");
        } else {
            System.out.println("Substring is not present");
        }

        // Method 2: Using indexOf
        if (mainText.indexOf(subText) != -1) {
            System.out.println("Found using indexOf at position " + mainText.indexOf(subText));
        } else {
            System.out.println("Not found using indexOf");
        }
    }
}