import java.util.*;
class CircleAreaInstance {
    int r;
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        CircleAreaInstance ob=new CircleAreaInstance();
        System.out.println("Enter the radius of the circle");
        ob.r=sc.nextInt();
        double area=3.14*ob.r*ob.r;
        System.out.println("Area of the circle is "+area);
    }
}
