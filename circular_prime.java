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
        Scanner sc=new Scanner (System.in);
        String s=sc.next();
        int a=Integer.parseInt(s);
        String sh="";
        if(isprime(a))
        {
            for(int i=s.length()-1;i>=0;i--)
            {
                sh+=s.charAt(i);
            }
        
        int ch=Integer.parseInt(sh);
        if(isprime(ch) && isprime(a))
        {
            System.out.print("circular prime");
        }
        else
        {
            System.out.print("prime but not a circular prime");
        }
        
        }
        else
        {
            System.out.print("not prime");
        }
    }
}