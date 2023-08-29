import java.util.Scanner;
public class c{
    public static void main(String[] srgs){
        Scanner sc=new Scanner(System.in);
        int hurl=sc.nextInt();
        int Spin=sc.nextInt();
        int Speed=sc.nextInt();
        if(hurl>50 && Spin>60 && Speed>100)
        {
            System.out.println("10");
        }
        else if(hurl>50 && Spin>60 && Speed<100)
        {
            System.out.println("9");
        }
        else if(hurl<50 && Spin>60 && Speed>100)
        {
            System.out.println("8");
        }
        else if(hurl>50 && Spin<60 && Speed>100)
        {
            System.out.println("7");
        }
        else if(hurl>50 || Spin>60 || Speed>100)
        {
            System.out.println("6");
        }
        else
        {
            System.out.println("5");
        }
    }
}