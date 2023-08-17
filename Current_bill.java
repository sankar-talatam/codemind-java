import java.util.Scanner;
public class c{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double t;
        if(a<200)
        {
            t=(a*1.20)+100;
            System.out.printf("%.2f",t);
        }
        else if(a>=200 && a<400)
        {
            t=(a*1.50)+100;
            System.out.printf("%.2f",t);
        }
        else if(a>=400 && a<600)
        {
            t=(a*1.80)+(a*1.80*0.15);
            System.out.printf("%.2f",t);
        }
        else if(a>=600)
        {
            t=(a*2.00)+(a*2.00*0.15);
            System.out.printf("%.2f",t);
        }
    }
}