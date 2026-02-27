public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 9.0");
        System.out.println("---------------------------------------------------");

        String input = "madam";

        // Call the recursive method
        boolean isPalindrome = check(input, 0, input.length() - 1);

        // Output Result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }


    private static boolean check(String s, int start, int end) {
        // Base Condition 1: If pointers cross, all characters matched
        if (start >= end) {
            return true;
        }

        // Base Condition 2: If characters mismatch, it's not a palindrome
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive Call: Check the next inner pair
        return check(s, start + 1, end - 1);
    }
}

