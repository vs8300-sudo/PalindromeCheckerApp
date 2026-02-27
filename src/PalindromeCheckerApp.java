/**
 * PalindromeCheckerApp
 * UC4: Character Array Based Palindrome Check
 * * Description:
 * This class validates a palindrome by converting
 * the string into a character array and comparing
 * characters using the two-pointer technique.
 * * @author Developer
 * @version 4.0
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 4.0");
        System.out.println("---------------------------------------------------");

        // UC4: Hint - Declare and initialize the input string
        String input = "radar";

        // UC4: Hint - Convert the string into a character array
        char[] chars = input.toCharArray();

        // UC4: Hint - Initialize pointers
        int start = 0;
        int end = chars.length - 1;

        // UC4: Hint - Assume palindrome initially
        boolean isPalindrome = true;

        // UC4: Hint - Continue comparison until pointers cross
        while (start < end) {
            // Compare characters at current pointer positions
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break; // Mismatch found, exit loop
            }
            // Move pointers towards the center
            start++;
            end--;
        }

        // Console Output
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}