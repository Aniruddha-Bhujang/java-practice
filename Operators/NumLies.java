import java.util.Scanner;
public class NumLies {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if(num >= 10 && num <= 50){
            System.out.println("The Number Lies in the Range");
        }else {
            System.out.println("The Number Does not lies in the Range");
        }
        sc.close();


    }
}