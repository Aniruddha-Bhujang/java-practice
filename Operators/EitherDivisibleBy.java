import java.util.Scanner;
public class EitherDivisibleBy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("This number is divisible by both 3 and 5.");
        } else if (n % 3 == 0) {
            System.out.println("This number is divisible by 3.");
        } else if (n % 5 == 0) {
            System.out.println("This number is divisible by 5.");
        } else {
            System.out.println("This number is not divisible by either 3 or 5.");
        }
        sc.close();
    }
}