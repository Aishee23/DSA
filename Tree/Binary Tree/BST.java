
/* OUTPUT
Root Node is:5
Left child of5:2
Left child of2:1
Right child of2:4
Left child of4:3
Right child of5:7
Left child of7:6
Right child of7:9
Left child of9:8
Right child of9:10

|       |       |------>10
|       |------>9
|       |       |------>8
|------>7
|       |------>6
5
|       |------>4
|       |       |------>3
|------>2
|       |------>1

  */





public class BST {
    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value)
        {
            this.value=value;
        }
    
        
    
        public int getValue()
        {
            return value;
        }
    }
        private Node root;
        public BST(){  


        }
        public int height(Node node)
        {
            if(node==null)
            {
                return -1;
            }
            return node.height;
        }

        public boolean isEmpty()
        {
            return root==null;
        }
    
        public void display()
        {
            display(root,"Root Node is:");
        }
        private void display(Node node, String details)
        {
            if(node==null){
                return;
            }
            System.out.println(details+node.getValue());
            display(node.left,"Left child of"+node.getValue()+ ":");
            display(node.right,"Right child of"+node.getValue()+ ":");
        }
        public void insert(int value){
            root=insert(value,root);
        }
        private Node insert(int value,Node node)
        {    
            if(node==null){
               node = new Node(value);
               return node;
            }
            if(value<node.getValue()){
                node.left=insert(value,node.left);
            }
            if(value>node.getValue()){
            node.right=insert(value,node.right);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        return node;
     }

     public boolean balanced()
     {
        return balanced(root);
     }
     private boolean balanced(Node node)
     {
        if(node==null)
        {
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
     }

     public void populate(int[] nums)
     {
        for(int i=0;i<nums.length;i++)
        {
            this.insert(nums[i]);
        }
     }
     public void displayp()
    {
        display(root,0);
    }
    private void display(Node node,int level)
    {
        if(node==null)
        {
            return;
        }
        display(node.right,level+1);
            if(level!=0)
            {
                for(int i=0;i<level-1;i++)
                {
                    System.out.print("|\t");
                }
                System.out.println("|------>"+node.value);
            }else{
                System.out.println(node.value);
            }
            display(node.left,level+1);
        }
     public static void main(String[] args) {
       
        BST tree = new BST();
        int[] nums = { 5, 2, 7, 1, 4, 6, 9, 8, 3, 10 };
        tree.populate(nums);
        tree.display();
        tree.displayp();
      }
}
