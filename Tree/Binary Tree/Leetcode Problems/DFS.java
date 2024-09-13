class DFS {

  // dfs using stack
  void dfsStack(Node node) {
    if(node == null) {
      return;
    }
    Stack<Node> stack = new Stack<>();
    stack.push(node);

    while(!stack.isEmpty()) {
      Node removed = stack.pop();
      System.out.print(removed.val + " ");
      if(removed.right != null) {
        stack.push(removed.right);
      }
      if(removed.left != null) {
        stack.push(removed.left);
      }
    }
  }

  int diameter = 0;
  public int diameterOfBinaryTree(TreeNode root) {
    height(root);
    return diameter-1;
  }
  int height(TreeNode node) {
    if(node == null) {
      return 0;
    }

    int leftHeight = height(node.left);
    int rightHeight = height(node.right);

    int dia = leftHeight + rightHeight + 1;
    diameter = Math.max(diameter, dia);

    return Math.max(leftHeight, rightHeight) + 1;
    
  }
