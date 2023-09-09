import java.util.Scanner;
public class c{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=0;
        int sum,rem;
        while(n!=0)
        {
             rem=n%10;
             sum=rem+temp*10;
            n=n/10;
             System.out.print(sum);
        }
        
    }
}