import java.util.*;
public class c{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=0;
        while(n!=0)
        {
            int rem=n%10;
            temp=rem+temp*10;
            n=n/10;
        }
        System.out.print(temp);
    }
}