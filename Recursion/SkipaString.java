
public class SkipACharfromString {
    public static void main(String[] args)
    {
      
       System.out.println(skipbox("boxmaster has a match box and does boxing"));
    }
static String skipbox(String up)
    {
        if(up.isEmpty())
        {   
            return " ";
        }
        char ch=up.charAt(0);
        
        if(up.startsWith("box"))
        {
            return skipbox(up.substring(3)); //3 because box is of the length 3. it depends on the string we want   to skip
           
        }else{
            return ch+ skipbox(up.substring(1));
           
        }
    }
}
