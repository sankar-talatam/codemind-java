import java.util.Scanner;
public class c{
    public static void main(String[] argss){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[] =new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum+=array[i];
        }
        System.out.println(sum);
    }
}