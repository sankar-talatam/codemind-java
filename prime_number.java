import java.util.*;
public class c{
    public static Boolean isprime(int n)
    {
        if(n<2)
        {
            return false;
        }
        else
        {
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isprime(n))
        {
            System.out.print("prime");
        }
        else
        {
            System.out.print("not a prime");
        }
    }
}