import java.util.Scanner;
public class maxminintwoDarray {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int[][] arr= new int[3][3];
        System.out.println("Enter the elements of the array: ");
        //input
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
        //printing the array
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }

        //finding the maximum number of elements in the 2D array
        int ans1=max(arr);
        System.out.println("The maximum value of the array: " +ans1);
        //finding the minimum number of elements in the 2D array
        int ans2=min(arr);
        System.out.println("The minimum value of the array: " +ans2);
    }
    //function to find the maximum number of elements in the 2D array
    static int max(int[][] arr)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
               if(arr[i][j]>max)
               {
                   max=arr[i][j];
               }
    }
    return max;
}
    static int min(int[][] arr)
    {
        int min=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
               if(arr[i][j]<min)
               {
                   min=arr[i][j];
               }
    }
    return min;
    }
}
