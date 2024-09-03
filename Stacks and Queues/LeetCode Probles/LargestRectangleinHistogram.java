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



/* Understanding the Width Calculation:
When a bar is popped from the stack:

The height of the rectangle is the height of the bar that was just popped.
The width of the rectangle is determined by how far we can extend this rectangle to the left and right.
Width Calculation in Two Scenarios:

When the stack is empty after popping:
If the stack is empty after popping, it means the popped bar was the smallest bar so far. Therefore, the rectangle can extend from the beginning (index 0) to the current index.
Width = index - 0 = index
When the stack is not empty after popping:
If the stack is not empty after popping, it means there is a bar to the left that is shorter than or equal to the current bar height, which limits how far we can extend to the left.
Width = index - (stack.peek() + 1)
Here, stack.peek() gives us the index of the bar that is still in the stack, which is the left boundary of the rectangle.
Example:
Consider the following example where heights = [2, 1, 5, 6, 2, 3]:

At Index 3: When index = 4, the height is 2, and the stack contains [1, 2, 3]. The height at index = 3 is 6, which is greater than the current height of 2.

The bar at index = 3 (height 6) is popped, and the area is calculated:

Height = 6 (height of the popped bar)
Width:
The stack still contains index 2 (height 5), so the width is determined by index - stack.peek() - 1 = 4 - 2 - 1 = 1.
Area = 6 * 1 = 6
At Index 4: When the next bar is popped (height 5 at index 2):

Height = 5
Width:
The stack still contains index 1 (height 1), so the width is determined by index - stack.peek() - 1 = 4 - 1 - 1 = 2.
Area = 5 * 2 = 10
General Formula:
Width = index - stack.peek() - 1 (if the stack is not empty after popping)
Width = index (if the stack is empty after popping)*/
