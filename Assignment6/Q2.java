package Assignment6;

public class Q2 {

}


class Solution {
    public boolean isBalanced(TreeNode root) {
        // Base case: An empty tree is always balanced
        if (root == null) {
            return true;
        }

        // 1. Calculate the actual height of left and right subtrees
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        // 2. Check if the current node is balanced
        int heightDifference = Math.abs(leftHeight - rightHeight);

        // 3. Current node must be balanced AND all subtrees must be balanced
        return heightDifference <= 1 
            && isBalanced(root.left) 
            && isBalanced(root.right);
    }

    // Helper method to compute the maximum height of a node
    private int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
    }
}
