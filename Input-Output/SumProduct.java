import java.util.Scanner;
public class SumProduct {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        int product = a * b;
        System.out.println("Sum is:" + sum);
        System.out.println("Product is:" + product);
        sc.close();
    }
}