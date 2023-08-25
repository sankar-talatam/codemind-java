import java.util.*;
public class c{
    public static void main(String[] argss){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(); 
        int n=sc.nextInt();
         int count=0;
         for(int i=m;i<=n;i++)
         {
             if(i%2==0 && i%3==0)
             {
                 count++;
             }
         }
         System.out.print(count);
    }
}