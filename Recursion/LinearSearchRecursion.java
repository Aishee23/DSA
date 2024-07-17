public class LinearSearchRecursion {
    public static void main(String[] args)
    {
        int[] arr={1,90,4,59,99};
        System.out.println(finds(arr,99,0));
        //System.out.println(find(arr,99,0));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans= findAllIndex(arr,99,0,list);
        System.out.println(ans);
    }
    //function for true and
    static boolean finds(int[] arr,int target,int index)
    {
          if(index==arr.length)
          {
            return false;
          }
          return arr[index]==target || finds(arr,target,index+1);
    }
    //function to return the index value of the target
    static int find(int[] arr,int target,int index)
    {
          if(index==arr.length)
          {
            return -1;
          }
          if(arr[index]==target)
          {
            return index;
          }else 
          return  find(arr,target,index+1);
    }

//Function for Duplicate elements
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
    if (index == arr.length) {
        return list;
    }
    if (arr[index] == target) {
        list.add(index);
    }
    return findAllIndex(arr, target, index + 1, list);
}
}
