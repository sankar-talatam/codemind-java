import java.util.*;
public class c{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
        int count=0;
        for(int i=M;i<=N;i++)
        {
            if(i%3==0)
            {
                count++;
            }
        }
        System.out.print(count);
    }
}