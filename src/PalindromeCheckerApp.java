import java.util.ArrayDeque;
import java.util.Deque;

/**
 * PalindromeCheckerApp
 * Use Case 7: Deque Based Optimized Palindrome Checker
 * * Description:
 * This class validates a palindrome using a Deque (Double Ended Queue).
 * Characters are compared by removing elements from both ends.
 * * @author Developer
 * @version 7.0
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 7.0");
        System.out.println("---------------------------------------------------");

        // UC7 Hint: Define the input string
        String input = "refer";

        // UC7 Hint: Create a Deque to store characters
        Deque<Character> deque = new ArrayDeque<>();

        // UC7 Hint: Add each character to the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // UC7 Hint: Flag to track palindrome result
        boolean isPalindrome = true;

        // UC7 Hint: Continue comparison while more than one element exists
        while (deque.size() > 1) {
            // Remove from both ends and compare
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        // Output Result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}