import java.util.Arrays;

public class MergeSort {
    public static void  main(String[] args){
 int [] arr={2,8,5,9,6,7,3,1,4,};
 int [] ans=mergeSort(arr);
 System.out.println(Arrays.toString(ans));
    }
    static int[] mergeSort(int[] arr)
    {
        //base condition
        if(arr.length==1)
        {
            return arr;
        }
        //dividing the array into 2
        int mid=arr.length/2;
        int[] left=mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid, arr.length));

        return merge(left, right);
    }
    private static int[] merge(int[] first, int[] second)
    {
      int[] result=new int[first.length+second.length];

      int i=0;
      int j=0;
      int k=0;

      while(i<first.length && j<second.length) //i and j are pointers to travers the arrays
      {
         if(first[i]<second[j])
         {
            result[k]=first[i];
            i++; 
         }else{
            result[k]=second[j];
            j++;
         }
         k++; // whatever element is taken result array needs to be incremented
      }

      //case when the 2 arrays are unequal

      //when the first array has extra elements
      while(i<first.length)
      {
        result[k]=first[i];
            i++;
            k++; //
      }

      // when the second array has extra elements
      while(j<second.length)
      {
        result[k]=second[j];
            j++;
            k++;
      }
      return result;
    }
}
