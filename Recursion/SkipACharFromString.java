public class SkipACharfromString {
    public static void main(String[] args)
    {
       skip("","abacdsas");
        System.out.println(skipi("aishee"));
    }
    static void skip(String p, String up)
    {
        if(up.isEmpty())
        {   
            System.out.println(p);
            return ;
        }
        char ch=up.charAt(0);
        
        if(ch=='a')
        {
            skip(p,up.substring(1));
           // System.out.println(p);
        }else{
            skip(p+ch,up.substring(1));
            //System.out.println(p);
        }
    }
    //Fuction without taking extra empty string in the argument of the recursive function call
    
    static String skipi(String up)
    {
        if(up.isEmpty())
        {   
            return " ";
        }
        char ch=up.charAt(0);
        
        if(ch==('a'))//||'e'||'i'||'o'||'u'))
        {
            return skipi(up.substring(1));
           
        }else{
            return ch+ skipi(up.substring(1));
           
        }
    }
}
