import java.util.ArrayList;

public class SubsetCreation {
    public static void main(String[] args){
        subsetcreate("","abc");
        //store as arraylist
        System.out.println(subsetcreat("","abc"));
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
    static ArrayList<String> subsetcreat(String p, String up)
    {
        if(up.isEmpty())
        {   ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            //System.out.println(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=subsetcreat(p+ch,up.substring(1));
        ArrayList<String> right =subsetcreat(p,up.substring(1));
        left.addAll(right); //add the left and right elements of the recursive tree
        return left;
    }
}
