
class Solution {
    int c = 0; 
    TreeNode res = null;
    public int kthSmallest(TreeNode root, int k) {
        kth(root, k);
        return res.val;
    }
    private void kth(TreeNode root, int k){
        if(root == null){
            return;
        }
        kth(root.left, k);
        c++;
        if(c == k){
            res = root;
            return;
        }
        kth(root.right, k);
    }
}