import java.util.Scanner;
public class Divisible {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        if(num % 3 == 0 && num % 5 == 0){
            System.out.println("This Number is Divisible by both 3 and 5");
        }else{
            System.out.println("This Number is not Divisible  by both 3 and 5");
        }
        sc.close();
    }
}