import java.util.Scanner;
public class c{
    public static void main(String[] argss)
    {
        Scanner sc=new Scanner(System.in);
        String ch=sc.nextLine();
        String ct=sc.nextLine();
        double n=sc.nextDouble();
        if(n<199)
        {
            System.out.printf("%.2f",(n*1.20)+100);
        }
        else if(n>=200 && n<400)
        {
            System.out.printf("%.2f",(n*1.50)+100);
        }
        else if(n>=400 && n<600)
        {
            System.out.printf("%.2f",(n*1.80)+n*1.80*0.15);
        }
        else
        {
            System.out.printf("%.2f",(n*2.00)+n*2.00*0.15);
        }
    }
}