import java.util.Arrays;
public class insertionsort {
    public static void main(String[] args)
    {
        int []arr={3,1,2,9,5,4,8};
        System.out.println(Arrays.toString(arr));
        insertions(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertions(int[] arr)
    {
         for (int i = 0; i < arr.length-1; i++) // we use i=n-2 because if n-1 is taken j will be out of bound giving out of bound error
         {
            for(int j=i+1; j >0; j--) //j starts from behind i and goes decrementing till j>0 
            {
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                }else
                break;
            }
         }
    }
    static void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
