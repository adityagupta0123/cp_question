
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if( root == null)
            return "x";
        String leffSerialize = serialize(root.left);
        String rightSerialize = serialize(root.right);
        
        return root.val +","+ leffSerialize + ","+ rightSerialize;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> nodeLeft = new LinkedList<>();
        nodeLeft.addAll(Arrays.asList( data.split(",")));
        return deserializeHelper(nodeLeft);
    }
    public TreeNode deserializeHelper(Queue<String> nodeLeft){
        String valueForNode = nodeLeft.poll();
        if( valueForNode.equals("x")) 
            return null;
        TreeNode newNode = new TreeNode( Integer.valueOf( valueForNode ) );

        newNode.left = deserializeHelper(nodeLeft);
        newNode.right = deserializeHelper(nodeLeft);

        return newNode ;
    }
}
