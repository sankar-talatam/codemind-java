import java.util.*;
public class c{
    public static boolean isprime(int n)
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
        int N=sc.nextInt();
        int c = 0;
        for(int i=1;i<N;i++)
        {
            if(N%i==0)
            {
                if(isprime(i)&&isprime(N/i))
                {
                    c=1;
                    System.out.printf("%d %d",i,N/i);
                    break;
                }
            }
        }
        if(c==0)
        System.out.println("-1");
        
    }
}