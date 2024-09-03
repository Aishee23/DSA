//https://leetcode.com/problems/largest-rectangle-in-histogram/

public int largestRectangleArea(int[] heights) {
    Stack<Integer> stack = new Stack<>();
    int maxArea = 0;
    int index = 0;

    while (index < heights.length) {
        if (stack.isEmpty() || heights[index] >= heights[stack.peek()]) {
            stack.push(index);
            index++;
        } else {
            int top = stack.pop();
            int width = stack.isEmpty() ? index : index - stack.peek() - 1;
            maxArea = Math.max(maxArea, heights[top] * width);
        }
    }

    while (!stack.isEmpty()) {
        int top = stack.pop();
        int width = stack.isEmpty() ? index : heights.length - stack.peek() - 1;
        maxArea = Math.max(maxArea, heights[top] * width);
    }

    return maxArea;
}
