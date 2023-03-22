import java.util.*;
class TriAreaInstance {
    int h,b;
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        TriAreaInstance n=new TriAreaInstance();
        System.out.println("Enter the height and base length of the triangle");
        n.h=sc.nextInt();
        n.b=sc.nextInt();
        float area=(1/2)*n.h*n.b;
        System.out.println("Area of the triangle = "+area);
    }
}
