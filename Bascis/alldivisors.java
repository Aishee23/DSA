import java.util.Scanner;
public class alldivisors {
    public static void main(String[] args)
    {
        /*Scanner id= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=id.nextInt();
        System.out.println("The divisors of " + n + " are: ");
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.println(i);
        }*/
        Scanner id= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=id.nextInt();
        System.out.println("The divisors of " + n + " are: ");
        for(int i=1; i<=(Math.sqrt(n)); i++){
            if(n%i==0){
                System.out.println(i);
                if(n/i!=i)
                {
                    System.out.println(n/i);
                    
                }

    }
}
}
}
