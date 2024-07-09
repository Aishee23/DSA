import java.util.Arrays;
public class selection {
    public static void main(String[] args){
        int[]arr={-44,5,-1,2,3};
        System.out.println(Arrays.toString(arr));
        selections(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void selections(int[] arr)
    {
       
        for(int i=0;i<arr.length;i++)
        {   //n-i-1 is the number of times the comparision will be done
             int last=arr.length-i-1;
             //finding the index of the max value
            int maxIndex=getMaxIndex(arr,0,last);
            //swapping it with the last index
            swap(arr,maxIndex,last);
        }
    }
    static int getMaxIndex(int[] arr,int start,int end)
    {int max=start;
        for(int i=start;i<end;i++)
        {  
            if(arr[max]<arr[i])
            {
                max=i;
            }
        }return max;
    }
    static void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
