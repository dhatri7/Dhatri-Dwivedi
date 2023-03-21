import java.util.*;
class AverageInstance {
    int a,b;
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        AverageInstance k=new AverageInstance();
        System.out.println("Enter the two numbers");
        k.a=sc.nextInt();
        k.b=sc.nextInt();
        double avg=(k.a+k.b)/2;
        System.out.println("Average = "+avg);
    }
}
