public class Studentmarks {
   public static void main(String[] args) {
        int maths = 70;
        int physics = 78;
        int chemistry = 80;
        int total_marks = maths + physics + chemistry;
        double average = (maths + physics + chemistry) / 3.0;
        System.out.println("Total:" + total_marks);
        System.out.println("Avg:" + average);
    }
}
