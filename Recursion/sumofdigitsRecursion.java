public class sumofdigits {
    public static void main(String[] args)
    {
       System.out.println(sumofdigi(130));
    }
    static int sumofdigi(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        return (n%10)+sumofdigi(n/10);
    }
}
