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
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int count=0;
        for(int i=m;i<=n;i++)
        {
           if(isprime(i))
           {
               count++;
           }
        }
        System.out.print(count);
    }
}