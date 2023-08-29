import java.util.Scanner;
public class c{
    public static void main(String[] argss){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%3!=0 && n%5!=0 && n%7!=0)
        {
            System.out.println(n);
        }
        else if(n%3==0 && n%5==0 && n%7!=0)
        {
            System.out.println("PlingPlang");
        }
        else if(n%3!=0 && n%5!=0 && n%7==0)
        {
            System.out.println("Plong");
        }
        else if( n%7==0)
        {
            System.out.println("Plong");
        }
        else if( n%5==0)
        {
            System.out.println("Plang");
        }
        else
        {
            System.out.println("Pling");
        }
    }
}