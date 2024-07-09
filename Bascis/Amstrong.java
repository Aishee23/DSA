import java.util.Scanner;
public class amstrong {
    public static void main(String[] args)
 {
    Scanner id= new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n=id.nextInt();
    System.out.println("The number is: "+n);
    int dup=n;
    int sum=0;
    //int revn=0;
    while(n>0)
    {
        int ld=n%10;
        sum=sum+(ld*ld*ld);
        n=n/10;
        //revn=revn*10+ld;

    }
    if(sum==dup)
    {
        System.out.println(dup+" is an Amstrong number");
    }else{
        System.out.println(dup+" is not an Amstrong number");
    }

 }
}
