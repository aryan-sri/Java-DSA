public class Binary_Treee {
    static TreeNode root;

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        int height;

       

        TreeNode(int val) {
            this.val = val;
        }
    }

     public int height(TreeNode N) {
            if (N == null) {
                return -1;
            }
            return N.height;
        }

    public void insrt(int val) {
        root = insertRec(root, val);
    }

    public TreeNode insertRec(TreeNode root, int val) {
        if (root == null) {
            TreeNode node = new TreeNode(val);
            return node;
        }
    
        if (val < root.val) {
            root.left = insertRec(root.left, val);
        } else if (val > root.val) {
            root.right = insertRec(root.right, val);
        }
    
        root.height = Math.max(height(root.left), height(root.right)) + 1;
        return rotated(root);
    }

    public TreeNode rightRotate(TreeNode node)
    {
        TreeNode Right = node.right;
        TreeNode n = node.left;
        node.left = n.right;
        node.right = Right;
        n.right = node;

        node.height = Math.max(height(node.left), height(node.right))+1;
        n.height = Math.max(height(n.left), height(n.right))+1;
        return n;
    }

    public TreeNode leftRotate(TreeNode node) {
        TreeNode Left = node.left;
        TreeNode n = node.right;
        node.right = n.left;
        node.left = Left;
        n.left = node;

        node.height = Math.max(height(node.left), height(node.right))+1;
        n.height = Math.max(height(n.left), height(n.right))+1;
        return n;
    }
    
    public TreeNode rotated(TreeNode node)
    {
        if(height(node.left) - height(node.right)>1)
        {
            //left - left Case
            if(height(node.left.left) - height(node.left.right) < 0) 
            {
                return rightRotate(node);
            }
            //left - Right Casee
            if(height(node.left.left) - height(node.left.right) > 0)
            {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        
        if(height(node.left) - height(node.right) < -1)
        {
            //Right - Right Case
            if(height(node.right.left) - height(node.right.right) < 0) 
            {
                return leftRotate(node);
            }
            // Right -left Case
            if(height(node.left.left) - height(node.left.right) > 0)
            {
                node.left = rightRotate(node.left);
                return leftRotate(node);
            }
        }

        return node;
    }
    

    public void Display() {
        Dissplay(root, "Root is: ");
    }

    public void Dissplay(TreeNode root, String msg) {
        if (root == null) {
            return;
        }
        System.out.println(msg + root.val);
        Dissplay(root.left, "Left child of " + root.val + ": ");
        Dissplay(root.right, "Right child of " + root.val + ": ");
    }

    public int count_Number_nodes(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }

        int leftNodes = count_Number_nodes(root.left);
        int rightNodes = count_Number_nodes(root.right);
        return leftNodes+rightNodes+1;
    }

    public int sum_of_node(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
 
        int left = sum_of_node(root.left);
        int right = sum_of_node(root.right);
        return left+right+root.val;
    }

    public boolean search(int Val,TreeNode root)
    {
        if(root == null)
        {
            return false;
        }
        if(root.val == Val)
        {
            return true;
        }
        else if(root.val > Val)
        {
            return search(Val, root.left);
        }
        else
        {
            return search(Val, root.right);
        }
        
    }
    public static void main(String[] args) {
        Binary_Treee Tree = new Binary_Treee();
        Tree.insrt(3);
        Tree.insrt(2);
        Tree.insrt(1);
        Tree.insrt(4);
        Tree.Display();
        System.out.println(Tree.count_Number_nodes(root));
        System.out.println(Tree.sum_of_node(root));
        System.out.println(Tree.search(4, root));
        
    }
}
