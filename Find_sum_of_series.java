import java.util.Scanner;
public class c{
    public static void main(String[] rahs){
        Scanner sc=new Scanner(System.in);
        double n=sc.nextInt();
        double sum=0;
        for(double i=1;i<=n;i++)
        {
            sum+=(1/i);
        }
        System.out.printf("%.2f",sum );
    }
}