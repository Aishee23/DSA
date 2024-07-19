public class SubsetCreation {
    public static void main(String[] args){
        subsetcreate("","abc");
    }
    static void subsetcreate(String p, String up)
    {
        if(up.isEmpty())
        {   
            System.out.println(p);
            return ;
        }
        char ch=up.charAt(0);
        subsetcreate(p+ch,up.substring(1));
        subsetcreate(p,up.substring(1));
      
    }
}
