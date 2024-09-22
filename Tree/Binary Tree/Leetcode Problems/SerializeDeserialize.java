public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "X,";
        }
        return root.val + "," + serialize(root.left) + serialize(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] nodes = data.split(",");
        int[] index = new int[1]; // create an int array to hold the index
        return deserializeHelper(nodes, index)[0];
    }

    private TreeNode[] deserializeHelper(String[] nodes, int[] index) {
        if (nodes[index[0]].equals("X")) {
            index[0]++;
            return new TreeNode[]{null};
        }
        TreeNode node = new TreeNode(Integer.parseInt(nodes[index[0]++]));
        node.left = deserializeHelper(nodes, index)[0];
        node.right = deserializeHelper(nodes, index)[0];
        return new TreeNode[]{node};
    }
}
