import java.util.*;
class AverageLocal {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        double avg=(a+b)/2;
        System.out.println("Average = "+avg);
    }
}
