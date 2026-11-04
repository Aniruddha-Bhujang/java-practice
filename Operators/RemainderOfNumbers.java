import java.util.Scanner;
public class RemainderOfNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number:");
        int a = sc.nextInt();

        System.out.println("Enter the second Number:");
        int b = sc.nextInt();
        if(b == 0){
            System.out.println("Division with zero is not possible");
        }else {
            int remainder = a % b;
            System.out.println("Remainder is :" + remainder);
        }
        sc.close();
    }
}