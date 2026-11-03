import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length and Breadth:");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        double area = length * breadth;
        System.out.println("Area of Rectangle is : " + area);
        sc.close();
    }
}