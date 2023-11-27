import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string to check for palindrome:");
        String input = scanner.nextLine();

        String transformedInput = transformInput(input);

        boolean isPalindrome = checkPalindrome(transformedInput);
        if (isPalindrome) {
            System.out.println("The transformed input is a palindrome.");
        } else {
            System.out.println("The transformed input is not a palindrome.");
        }
    }

    // Method to transform the input string by removing commas and exclamation marks, and converting to lowercase
    public static String transformInput(String input) {
        input = input.toLowerCase();
        input = input.replace(",", "");
        input = input.replace("!", "");
        return input;
    }

    // Method to check if a string is a palindrome
    public static boolean checkPalindrome(String input) {
        String reversed = reverseString(input);
        return input.equals(reversed);
    }

    // Method to reverse a string
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
}
