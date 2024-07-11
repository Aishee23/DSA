import java.util.Scanner;
public class fibonacci{
    public static void main(String[] args   )
    {     Scanner in=new Scanner(System.in);
        System.out.println("ENTER THE nth fibonacci number");
          int num = in.nextInt();
          int ans=fibo(num);
          System.out.println(ans);
    }
    static int fibo(int num)
    { if (num<2)
        {
            return num;
        }
        return fibo(num-1) +fibo(num-2);
    }
}
