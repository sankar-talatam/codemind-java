import java.util.*;
public class Test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            String a=sc.next();
            int b=Integer.parseInt(a,8);
            System.out.println(Integer.toString(b,2));
        }
    }
}