import java.util.*;
public class c{
    public static void main(String[] srsg){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int flag=0;
        for(int i=0;i<n;i++)
        {
            int x=i*(i+1);
            if(x==n)
            {
                System.out.print("YES");
                flag=1;
                break;
               
            }
           
        }
        if(flag==0)
        {
            System.out.println("NO");
            
        }
        
        
    }
}