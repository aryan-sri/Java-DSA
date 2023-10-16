public class Segment_Trees {
    public static void main(String[] args) {
        int[] arr = { 3,1,4,-1,7,9,8};
    }
    class Node
    {
         int data;
         int start;
         int end;
         Node left;
         Node right;
         Node(int left,int right)
         {
            this.start = left;
            this.end = right;
         }
    }
    Node root;
    public void insert(int[] arr)
    {
       root = construct(arr, 0, arr.length-1);
    }
    public Node construct(int[] arr, int start, int end)
    {
        if(start== end)
        {
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        int mid = (start+end)/2;
        Node node = new Node(start, end);

        node.left = construct(arr, start, mid);
        node.right = construct(arr, mid+1, end);

        node.data = node.left.data + node.right.data;

        return node;
    }

    public int Query(int start, int end)
    {
        return this.query(this.root, start, end);
    }

    public int query(Node root, int Query_Start, int Query_end)
    {
         // Case 1 if completely in range
         if(root.start >= Query_Start && root.end <= Query_end)
         {
            return root.data;
         }
         // Completely Out of Range
         else if( root.end < Query_Start || root.start > Query_end)
         {
            return 0;
         }
         else
         {
            return query(root.left, Query_Start, Query_end) + query(root.right, Query_Start, Query_end);
         }
    }

    public void update(int index, int value) {
        this.root.data = update(this.root, index, value);
      }
      private int update(Node node, int index, int value) {
        if (index >= node.start&& index <= node.end){
          if(index == node.start && index == node.end) {
            node.data = value;
            return node.data;
          } else {
            int leftAns = update(node.left, index, value);
            int rightAns = update(node.right, index, value);
            node.data = leftAns + rightAns;
            return node.data;
          }
        }
        return node.data;
      }
}
