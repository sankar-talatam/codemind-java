import java.util.*;
public class c{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n*n;
        boolean flag = true;
        while(n!=0)
        {
             if(n%10==t%10)
             {
                 n/=10;
                 t/=10;
             }
             else
             {
                 flag=false;
                 break;
             }
        }
        if(flag)
        {
            System.out.println("Automorphic Number");
        }
        else
        {
            System.out.println("Not an Automorphic Number");
        }
    }
}