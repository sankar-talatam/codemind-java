import java.util.Scanner;
public class c{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=a/60;
        int c=a%60;
        System.out.printf("%d Hour(s) %d Minute(s)",b,c);
    }
}