import java.util.Scanner;
public class Marks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Marks:");
        int maths = sc.nextInt();
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int totsl = (maths + physics + chemistry);
        double average = ((maths + physics + chemistry)/3.0);
        System.out.println("Total is:" + totsl);
        System.out.println("Average is:" + average);
        sc.close();
    }
}