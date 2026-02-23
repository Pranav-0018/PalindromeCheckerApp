import java.util.Stack;

public class PalindromeCheckerAPP {

    /**
     * Application entry point for UC5.
     * Uses Stack to validate palindrome.
     */
    public static void main(String[] args) {

        // Declare and initialize the input string
        String input = "noon";   // You can change this value

        // Create a Stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare original string with reversed (using stack pop)
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
}