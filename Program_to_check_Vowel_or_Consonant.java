import java.util.Scanner;
public class c{
    public static void main(String[] argss)
    {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch=='A' ||ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' ||ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
}