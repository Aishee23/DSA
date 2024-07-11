public class Binarysearch {
    public static void main(String[] args)
    {    int target=6;
         int [] arr={1,2,3,6,9,78};
         int ans=bs(arr,target,0,arr.length-1);
         System.out.println(ans);
    }
    static int bs(int[] a, int target, int start, int end)
    {
       if(start>end)
       {
        return -1;
       }
       int mid=start+(end-start)/2;
       if(a[mid]==target) 
       return mid;
       if(a[mid]<target)
       {
        return bs(a,target,mid+1,end);
       }else{
        return bs(a,target,start,mid-1);
       }
    }
}
