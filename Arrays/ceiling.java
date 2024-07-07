public class ceiling {
    public static void main(String[] args)
    {
         int [] a = {2, 3, 5, 9, 14, 16, 18};
         int target=15;
         int ans=ceilingbs(a,target);
         System.out.println(ans);
    }
    static int ceilingbs(int [] a, int target)
    {
       int start=0;
       int end=a.length-1;
       
       //int m=0;
       while(start<=end)
       {
        int middle=start+(end-start)/2; //new formula used because if start and end are very big,
                                        //then the summation will exceed the limitof integers and give error   
        if(target<a[middle])
        {
            end=middle -1;
        } else if(target>a[middle])
        {
            start=middle+1;
        }  else if(target==a[middle])
         {     
            //m=middle;
            return middle; //answer
         }                             
       }
       return start;
    }

}
