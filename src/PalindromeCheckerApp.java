public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 10.0");
        System.out.println("---------------------------------------------------");

        String input = "A man a plan a canal Panama";

        // UC10: Normalization Logic
        // replaceAll("[^a-zA-Z0-9]", "") removes everything except letters and numbers
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = true;

        // UC10 Hint: Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {
            // Compare symmetric characters
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Output Result
        System.out.println("Original Input : " + input);
        System.out.println("Normalized     : " + normalized);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}