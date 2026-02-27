
public class PalindromeCheckerApp {


    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 11.0");
        System.out.println("---------------------------------------------------");

        String input = "racecar";

        // Create an instance of the Service Class (OOP Approach)
        PalindromeService service = new PalindromeService();

        // Use the service to check the palindrome
        boolean isPalindrome = service.checkPalindrome(input);

        // Output Result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}


class PalindromeService {


    public boolean checkPalindrome(String input) {
        // UC11 Hint: Initialize pointers
        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}