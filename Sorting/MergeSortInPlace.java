import java.util.Arrays;

public class MergeSortInPLace {
    public static void main(String[] args)
    {
        int [] arr={2,8,5,9,6,7,3,1,4};
        mergeSortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSortInPlace(int[] arr,int s,int e)   // we are using void because we are modifying the original array not returning anything
    {
        //base condition
        if(e-s==1)
        {
            return ;
        }
        //dividing the array into 2
        int mid=(e+s)/2;
        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr,mid, e);

        mergeinplace(arr,s,mid,e);
    }
    private static void  mergeinplace(int[] arr,int s,int mid,int e)
    {
      int[] result=new int[e-s];

      int i=s;
      int j=mid;  //the secod part of the array starts from mid 
      int k=0;

      while(i<mid && j<e) //i and j are pointers to travers the arrays
      {
         if(arr[i]<arr[j])
         {
            result[k]=arr[i];
            i++; 
         }else{
            result[k]=arr[j];
            j++;
         }
         k++; // whatever element is taken result array needs to be incremented
      }

      //case when the 2 arrays are unequal

      //when the first array has extra elements
      while(i<mid)
      {
        result[k]=arr[i];
            i++;
            k++; //
      }

      // when the second array has extra elements
      while(j<e)
      {
        result[k]=arr[j];
            j++;
            k++;
      }

      for (int l = 0; l < result.length; l++) {
        arr[s+l] = result[l];
    }
}
}
