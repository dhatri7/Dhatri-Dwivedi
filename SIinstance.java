import java.util.*;
class SIinstance {
    int p;
    float r;
    int t;
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        SIinstance v=new SIinstance();
        System.out.println("Enter the principle, rate & time(in years)");
        v.p=sc.nextInt();
        v.r=sc.nextFloat();
        v.t=sc.nextInt();
        double SI=(v.p*v.r*v.t)/100;
        System.out.println("Simple Interest = "+SI);
    }
}
