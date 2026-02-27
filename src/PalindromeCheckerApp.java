import java.util.Stack;

/**
 * PalindromeCheckerApp
 * Use Case 5: Stack Based Palindrome Checker
 * * Description:
 * This class validates a palindrome using a Stack
 * data structure which follows the LIFO principle.
 * * @author Developer
 * @version 5.0
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 5.0");
        System.out.println("---------------------------------------------------");

        // UC5 Hint: Declare and initialize the input string.
        String input = "noon";

        // UC5 Hint: Create a Stack to store characters.
        Stack<Character> stack = new Stack<>();

        // UC5 Hint: Push each character of the string into the stack.
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // UC5 Hint: Assume palindrome initially.
        boolean isPalindrome = true;

        // UC5 Hint: Iterate again through original string and pop to compare.
        for (char c : input.toCharArray()) {
            // pop() retrieves the top element (the last character pushed)
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Output Result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}