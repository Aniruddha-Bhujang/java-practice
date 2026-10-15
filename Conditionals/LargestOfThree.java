public class LargestOfThree {
    public static void main(String[] args){
        int a = 12;
        int b = 10;
        int c = 42;
        if(a>b && a>c){
            System.out.println("a is greater");
        }else if(b>a && b>c){
            System.out.println("b is greater");
        }else{
            System.out.println("c is greater");
        }
    }
}