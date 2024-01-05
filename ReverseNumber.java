import java.util.Scanner;

class ReverseNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        int rd = 0;

       // System.out.print("Enter a number: ");
        n = sc.nextInt();

        while (n > 0) {
            int digit = n % 10;
            rd = rd * 10 + digit;
            n = n / 10;
        }

        System.out.println( rd);
if (n == rd ){
System.out.println("yes");}
else{
System.out.println("no");}
    }
}
