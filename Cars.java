import java.util.Scanner;
public class c{
    public static void main(String[] argss)
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int x=sc.nextInt();
        if(n1>n2)
        {
            System.out.println("-1");
        }
        else
        {
            System.out.println(((n1+x)/n2)+1);
        }
    }
}