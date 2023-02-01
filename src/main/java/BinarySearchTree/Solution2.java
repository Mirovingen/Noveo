package BinarySearchTree;
// Time complexity O(N)
// Space complexity O(N)
public class Solution2 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return balance(nums, 0, nums.length -1);
    }

    TreeNode balance(int[] nums, int left, int right){
        if (left > right) return null;
        int mid = (left+right)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = balance(nums, left, mid - 1);
        root.right = balance(nums, mid + 1, right);
        return root;
    }
}
