import java.util.Scanner;
public class c{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int p1=sc.nextInt(),p2=sc.nextInt(),p3=sc.nextInt(),p4=sc.nextInt();
        if(p1>=10 && p2>=10 && p3>=10 && p4>=10)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}