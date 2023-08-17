import java.util.Scanner;
public class c{
    public static void main(String[] arrgs){
        Scanner sc=new Scanner(System.in);
        double bs=sc.nextDouble();
        double da,hra,gs;
        if(bs<=10000)
        {
            da=0.80*bs;
            hra=0.20*bs;
            gs=bs+da+hra;
            System.out.printf("%.2f",gs);
        }
        else if(bs<=20000)
        {
            da=0.90*bs;
            hra=0.25*bs;
            gs=bs+da+hra;
            System.out.printf("%.2f",gs);
        }
        else if(bs>20000)
        {
            da=0.95*bs;
            hra=0.30*bs;
            gs=bs+da+hra;
            System.out.printf("%.2f",gs);
        }
        
    }
}