import java.util.Scanner;

public class PalindromeChecker {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();

    String transformed = transformInput(input);

    boolean isPalindrome = checkPalindrome(transformed);
    if (isPalindrome) {
      System.out.println("The transformed input is a palindrome.");
    } else {
      System.out.println("The transformed input is not a palindrome.");
    }
    System.out.println("What's Uppppp? Amir is printing this line.");
  }

  public static String transformInput(String input) {
    input = input.toLowerCase();
    input = input.replace(",", "");
    input = input.replace("!", "");
    return input;
  }

  public static boolean checkPalindrome(String input) {
    String reversed = reverseString(input);
    if (input.equals(reversed)) {
      return true;
    } else {
      return false;
    }
  }
  public static void addItem(String item) {
    System.out.println(item + " has been added to the list.");
}

public static void removeItem(String item) {
    System.out.println(item + " has been removed from the list.");
}

public static void displayList() {
    System.out.println("Grocery List:");
}

  public static String reverseString(String input) {
    StringBuilder reversed = new StringBuilder();
    for (int i = input.length() - 1; i >= 0; i--) {
      reversed.append(input.charAt(i));
    }
    return reversed.toString();
  }
}
