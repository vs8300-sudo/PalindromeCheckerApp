import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 12.0 (Strategy Pattern)");
        System.out.println("---------------------------------------------------");

        String input = "level";

        // Step 1: Define the strategy we want to use at runtime
        PalindromeStrategy strategy = new StackStrategy();

        // Step 2: Execute the algorithm through the interface
        boolean isPalindrome = strategy.check(input);

        // Output Result
        System.out.println("Input : " + input);
        System.out.println("Strategy Used: StackStrategy");
        System.out.println("Is Palindrome? : " + isPalindrome);
    }

    interface PalindromeStrategy {
        boolean check(String input);
    }

}


class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {
        // UC12 Hint: Create a stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character onto the stack (LIFO)
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from the stack
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

