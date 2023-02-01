package BinarySearchTree;
// Time complexity O(N)
// Space complexity O(N)
public class Solution1 {
    public boolean isValidBST(TreeNode root) {

        return validate(root, null, null);

    }

    public boolean validate(TreeNode root,Integer left,Integer right){
        if (root == null){
            return true;
        }

        if ((left != null && root.val <= left) || (right != null && root.val >= right)){
            return false;
        }

        return validate(root.right, root.val, right) && validate(root.left, left, root.val);
    }


}


