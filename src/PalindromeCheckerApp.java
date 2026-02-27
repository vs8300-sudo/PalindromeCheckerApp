import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 13.0 (Benchmarking)");
        System.out.println("---------------------------------------------------");

        String input = "level";

        // Define Strategy (Reusing StackStrategy from UC12)
        PalindromeStrategy strategy = new StackStrategy();

        // Capture Start Time
        long startTime = System.nanoTime();

        // Execute Algorithm
        boolean isPalindrome = strategy.check(input);

        // Capture End Time
        long endTime = System.nanoTime();

        // Calculate Duration
        long duration = (endTime - startTime);

        // Output Result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + duration + " ns");
    }
}


interface PalindromeStrategy {
    boolean check(String input);
}


class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }
}