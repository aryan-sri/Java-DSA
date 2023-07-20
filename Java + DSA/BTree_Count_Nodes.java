public class BTree_Count_Nodes
{
    public static int count =0;
    private Node root;

    private class Node
    {
        int val;
        Node left;
        Node right;

        public Node(int val)
        {
            this.val = val;
        }
    }
    
   public static int count(Node node)
   {
    if(node == null)
    {
        return 0;
    }

    int x = count(node.left);
    int y = count(node.right);
    return (x+y+1);
   }
   public static int SumOfNodes(Node node)
   {
     if(node == null)
     {
        return 0;
     }

     int left = SumOfNodes(node.left);
     int right = SumOfNodes(node.right);

     return left + right + node.val;
   }
    public static void main(String[] args) {
        BTree_Count_Nodes B = new BTree_Count_Nodes();
        
    }
}
