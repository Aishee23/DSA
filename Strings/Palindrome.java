public class palindrome{
    public static void main(String[] args)
    {
        String a = new String("MALAYALAM");
        a=a.toLowerCase();
        for(int i=0; i<a.length()/2; i++)
        {
             char start=a.charAt(i);
             char end=a.charAt(a.length()-1-i);
             if(start!=end)
             {
                System.out.printf("%s is not a palidrome. ",a);
             }
             else{
                System.out.printf("%s is a palidrome. ",a);
             }
        }
    }
}
