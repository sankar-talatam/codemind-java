import java.util.*;
public class c{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int mc=0;
           int me=0;
       for(int i=a;i<=b;i++)
       {
           
           int count=0;
           int temp=i;
           while(temp!=1)
           {
               if(temp%2==0)
               {
                   temp=temp/2;
                   count++;
               }
               else
               {
                   temp=(temp*3)+1;
                   count++;
               }
           }
           if(mc<count)
           {
               mc=count;
               me=i;
           }
           
       }
       System.out.print(me);
    }
}