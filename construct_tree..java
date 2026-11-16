class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
class Construct_tree{
    public TreeNode build(int[] arr,int i){
        if(i>=arr.length) return null;
        TreeNode node = new TreeNode(arr[i]);
        node.left = build(arr,2*i+1);
        node.right = build(arr,2*i+2);
        return node;
    }
    public TreeNode constructTree(int[] arr){
    return build(arr,0);}
}

