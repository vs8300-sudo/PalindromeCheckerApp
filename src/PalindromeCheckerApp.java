/**
 * PalindromeCheckerApp
 * UC3: Reverse String Based Palindrome Check
 * * Objective: Validate palindrome by reversing the string using a loop.
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 3.0");
        System.out.println("System initialized successfully.");
        System.out.println("---------------------------------------------------");

        // UC3: String to check
        String input = "madam";
        String reversed = "";

        // UC3 Hint: Iterate from the last character to the first
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i); // String concatenation
        }

        // UC3: Compare original and reversed using equals()
        boolean isPalindrome = input.equals(reversed);

        // Display Result
        System.out.println("Input text: " + input);
        System.out.println("Reversed text: " + reversed);
        System.out.println("Is it a Palindrome ? : " + isPalindrome);
    }
}