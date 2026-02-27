import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 8.0");
        System.out.println("---------------------------------------------------");

        // UC8 Hint: Define the input string
        String input = "level";

        // UC8 Hint: Create a LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // UC8 Hint: Add each character to the linked list
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        // UC8 Hint: Flag to track palindrome state
        boolean isPalindrome = true;

        // UC8 Hint: Compare until only one or zero elements remain
        while (list.size() > 1) {
            // LinkedList allows removal from both ends efficiently
            if (!list.removeFirst().equals(list.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        // Output Result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

