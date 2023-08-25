import java.util.Scanner;
public class c{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int lcm=1;
        for(int i=1;i<=1000;i++)
        {
            if(i%m==0 && i%n==0)
            {
                break;
            }
            else{
                lcm++;
            }
        }
        System.out.print(lcm);
    }
}