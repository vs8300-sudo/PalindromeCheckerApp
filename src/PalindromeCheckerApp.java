import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * PalindromeCheckerApp
 * Use Case 6: Queue + Stack Fairness Check
 * * Description:
 * This class demonstrates palindrome validation using
 * two different data structures:
 * - Queue (FIFO - First In First Out)
 * - Stack (LIFO - Last In First Out)
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 6.0");
        System.out.println("---------------------------------------------------");

        // UC6 Hint: Define the input string to validate
        String input = "civic";

        // UC6 Hint: Create a Queue (FIFO) and a Stack (LIFO)
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // UC6 Hint: Insert each character into both queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);  // Enqueue (FIFO)
            stack.push(c); // Push (LIFO)
        }

        // UC6 Hint: Flag to track palindrome status
        boolean isPalindrome = true;

        // UC6 Hint: Compare characters until the queue becomes empty
        while (!queue.isEmpty()) {
            // dequeue() gets the first char, pop() gets the last char
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        // Output Result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}