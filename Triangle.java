import java.util.Scanner;
public class c{
    public static void main(String[] arrgss){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        if(a==b && b==c && a==c)
        {
            System.out.println("Equilateral triangle");
        }
        else if(a==b || a==c || b==c)
        {
            System.out.println("Isosceles triangle");
        }
        else
        {
            System.out.println("Scalene triangle");
        }
    }
}