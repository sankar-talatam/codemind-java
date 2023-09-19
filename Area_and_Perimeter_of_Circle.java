import java.util.Scanner;
public class c{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        double ar=3.14*r*r;
        double pr=2*3.14*r;
        System.out.printf("%.2f
%.2f",ar,pr);
        
    }
}