class Solution {
    int ans ;
    public int rangeSumBST(TreeNode root, int low, int high) {
        ans = 0;
        dfs(root, low, high);
        return ans;
    }
    public void dfs(TreeNode root, int low, int high){
        if (root != null){
            if (low <= root.val && root.val <= high)
                ans += root.val;
            if( low < root.val)
                dfs(root.left, low, high);
            if ( root.val < high )
                dfs(root.right, low , high );
        }
    }  
}
