import java.util.Scanner;

public class palindrome{
 public static void main(String[] args)
 {
    Scanner id= new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n=id.nextInt();
    System.out.println("The number is: "+n);
    int dup=n;
    int revn=0;
    while(n>0)
    {
        int ld=n%10;
        n=n/10;
        revn=revn*10+ld;

    }
    if(revn==dup)
    {
        System.out.println(dup+" is a palindrome");
    }else{
        System.out.println(dup+" is NOT a palindrome");
    }

 }

}
