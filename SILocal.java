import java.util.*;
class SILocal {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principle, rate & time(in years)");
        int p=sc.nextInt();
        float r=sc.nextFloat();
        int t=sc.nextInt();
        double SI=(p*r*t)/100;
        System.out.println("Simple Interest = "+SI);
    }
}
