import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayLinearseach {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        
                int[][] arr = new int[3][3];
             
                // input
                System.out.println("Enter the elements of the array ");
                for (int row = 0; row < arr.length; row++) {
                    // for each col in every row
                    for (int col = 0; col < arr[row].length; col++) {
                        arr[row][col] = in.nextInt();
                    }
                }
        
                // output
               for (int row = 0; row < arr.length; row++) {

                   for (int col = 0; col < arr[row].length; col++) {
                      System.out.print(arr[row][col] + " ");
                   }
                   System.out.println();
               }
               System.out.println("Enter the element to be searched");
               int target=in.nextInt();
        int[] ans = search(arr,target); // format of return value {row, col}
        System.out.println(Arrays.toString(ans));
        
            }
            static int[] search(int[][] arr, int target) {
                for (int row = 0; row < arr.length; row++) {
                    for (int col = 0; col < arr[row].length; col++) {
                        if (arr[row][col] == target) {
                            return new int[]{row, col};
                        }
                    }
                }
                return new int[]{-1, -1};
            }
               
        }
        
