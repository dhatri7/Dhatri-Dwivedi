import java.util.*;
class RectAreaInstance {
    int l,b;
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        RectAreaInstance obj=new RectAreaInstance();
        System.out.println("Enter the length of the rectangle");
        obj.l=sc.nextInt();
        obj.b=sc.nextInt();
        int area = obj.l*obj.b;
        System.out.println("Area of the rectangle = "+area);
    }
}
