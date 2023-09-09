import java.util.*;
public class c{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int flag=0;
        for(int i=0;i<n;i++)
        {
            if(i*i==n)
            {
                flag=1;
                break;
            }
           
        }
        if(flag==0)
        {
            System.out.println("False");
        }
        else
        {
            System.out.println("True");
        }
        
    }
}