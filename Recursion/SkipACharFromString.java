public class SkipACharfromString {
    public static void main(String[] args)
    {
       skip("","abacdsas");
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
}
