import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of Circle:");
        Double radius = sc.nextDouble();
        Double area = (Math.PI * (radius * radius));
        System.out.println("Area of Circle is : " + area);
        sc.close();
    }
}