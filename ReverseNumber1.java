import java.util.Scanner;

class ReverseNumber1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int original, n, reversed = 0;

      //  System.out.print("Enter a number: ");
        original = sc.nextInt();
        n = original;

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }

        System.out.println( reversed);

        // Check if the original number is a palindrome
        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}
