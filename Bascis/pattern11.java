***** *****
****   ****
***     ***
**       **
*         *
**       **
***     ***
****   ****
***** *****



public class p11 {
    public static void main (String[] args) 
    {
        int n=5;
        for(int i =1; i<=n; i++)
        {    //spaces
            for (int j=1; j<=n-i+1; j++)
            {
                System.out.print("*");
            }
            //stars on left
            for (int j=i; j>=1; j--)
            {
                System.out.print(" ");
            }
            //stars on right
            for (int j=1; j<=i-1; j++)
            {
                System.out.print(" ");
            }
            for (int j=1; j<=n-i+1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
          //second half of the pattern
        for(int i =n-1; i>=1; i--)
        {
            for (int j=1; j<=n-i+1; j++)
            {
                System.out.print("*");
            }
            for (int j=i; j>=1; j--)
            {
                System.out.print(" ");
            }
            for (int j=1; j<=i-1; j++)
            {
                System.out.print(" ");
            }
            for (int j=1; j<=n-i+1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
