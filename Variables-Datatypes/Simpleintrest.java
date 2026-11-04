import java.util.Scanner;
public class Simpleintrest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal Amount:");
        double principal = sc.nextDouble();
        System.out.println("Enter the Rate of Intrest:");
        double rate = sc.nextDouble();
        System.out.println("Enter the time Duration:");
        double time = sc.nextDouble();

        double simpleIntrest = ((principal * rate * time )/ 100);
        System.out.println("Simple Intrest is:" + simpleIntrest);
        sc.close();
    }
}
