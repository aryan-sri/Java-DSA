public class DFS_Types {
    TreeNode root;

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public void insert(int val) {
        root = insertRec(root, val);
    }

    public TreeNode insertRec(TreeNode root, int val) {
        if (root == null) {
            TreeNode dum = new TreeNode(val);
            return dum;
        }
        if (val < root.val) {
            root.left = insertRec(root.left, val);
        } else {
            root.right = insertRec(root.right, val);
        }
        return root;
    }

    public void preorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }
    public void postorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.val + " ");
    }

    public void inorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.val + " ");
        inorderTraversal(node.right);
    }

    public static void main(String[] args) {
        DFS_Types tree = new DFS_Types();

        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);

        System.out.println("Inorder traversal of the binary search tree:");
        // tree.inorderTraversal(tree.root);
        tree.preorderTraversal(tree.root);
    }
}
