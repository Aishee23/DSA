
//INPUT: 12 in Old Phone Pad
//OUTPUT: [ad, ae, af, bd, be, bf, cd, ce, cf]   also counts the number of permutations using the padcount funcction

import java.util.ArrayList;
public class PhonePad {
    public static void main(String[] args)
    {
     //pad("","12");
     ArrayList<String> ans = padret("", "12");
    System.out.println(ans);
    }
    static void pad(String p, String up)
    {
        if (up.isEmpty()) 
        {
            System.out.println(p);
            return;
        }
        int digit= up.charAt(0)-'0';     //this will convert '2' to 2
        for (int i=(digit-1)*3;i<digit*3;i++) 
        {
            char ch = (char) ('a' + i); //start from 'a' and continue 
            pad(p + ch, up.substring(1));
        }
    }

    static ArrayList<String> padret(String p, String up)
    {
        if (up.isEmpty()) 
        {
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;

        }
        ArrayList<String> ans = new ArrayList<String>();
        int digit= up.charAt(0)-'0';     //this will convert '2' to 2
        for (int i=(digit-1)*3;i<digit*3;i++) 
        {
            char ch = (char) ('a' + i); //start from 'a' and continue 
            ans.addAll(padret(p + ch, up.substring(1)));
        }
        return ans;
    }
static int padcount(String p, String up)
    {
        if (up.isEmpty()) 
        {
            System.out.println(p);
            return 1;
        }
        int count =0;
        int digit= up.charAt(0)-'0';     //this will convert '2' to 2
        for (int i=(digit-1)*3;i<digit*3;i++) 
        {
            char ch = (char) ('a' + i); //start from 'a' and continue 
            count =count+ padcount(p + ch, up.substring(1));
        }
        return count;
    }
}




//INPUT: 12
//OUTPUT: [ad, ae, af, bd, be, bf, cd, ce, cf]

