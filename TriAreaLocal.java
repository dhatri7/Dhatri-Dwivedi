import java.util.*;
class TriAreaLocal {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the height and base length of the triangle");
        int h=sc.nextInt();
        int b=sc.nextInt();
        float area=(1/2)*h*b;
        System.out.println("Area of the triangle = "+area);
    }
}
