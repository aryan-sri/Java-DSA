import java.util.Stack;

import javax.swing.text.html.ListView;

public class Binary_Search_Trees {
    private Node root;
    public class Node
    {
        int value;
        Node left;
        Node right;
        int height;

        public Node(int value)
        {
            this.value = value;
        }

    }
    public int height(Node node)
    {
        if(node == null)
        {
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty() {
    return root == null;
   }
   public void insert(int value)
{
    root = insert(value,root);

}

    public Node insert(int value, Node node)
    {
          if(node == null)
          {
            node = new Node(value);
            return node;
          }

          if(value <  node.value)
          {
             node.left = insert(value, node.left);
          }
          if(value> node.value)
          {
            node.right = insert(value, node.right);
          }

          node.height = Math.max(node.left.height ,node.right.height)+1;
          return node;
    }
    public void populate(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      this.insert(nums[i]);
    }
  }

  public void populatedSorted(int[] nums) {
    populatedSorted(nums, 0, nums.length);
  }

  private void populatedSorted(int[] nums, int start, int end) {
    if (start >= end) {
      return;
    }

    int mid = (start + end) / 2;

    this.insert(nums[mid]);
    populatedSorted(nums, start, mid);
    populatedSorted(nums, mid + 1, end);
  }

  public boolean balanced() {
    return balanced(root);
  }

  private boolean balanced(Node node) {
    if (node == null) {
      return true;
    }
    return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
  }

  public void display() {
    display(this.root, "Root Node: ");
  }

  public void printZigZac(Node node)
  {
       if(root == null)
       {
        return;
       }

       Stack<Node> curr  = new Stack<>();
       Stack<Node> next = new Stack<>();
       
       boolean lefttoRight =  true;

       curr.push(node);
        
       while(!curr.isEmpty())
       {
        Node n = curr.pop();
        System.out.println(n.value +" ");
        if(lefttoRight)
        {
          if(node.left != null)
          {
           next.push(node.left);
          }
          if(node.right !=null)
          {
            next.push(node.right);
          }
        }
        else 
        {
          if(node.right !=null)
          {
            next.push(node.right);
          }
          if(node.left != null)
          {
           next.push(node.left);
          }

        }
        if(curr.isEmpty())
        {
          lefttoRight = !lefttoRight;
          Stack<Node> temp = curr;
          curr = next;
          next = temp;
        }

       }



  }

  public boolean Search(Node root, int target)
  {
      if(root == null)
      {
        return false;
      }

      if(root.value == target)
      {
        return true;
      }
      else if(root.value > target)
      {
         return Search(root.left, target);
      }
      else{
        return Search(root.right, target);
      }


  }

  private void display(Node node, String details) {
    if (node == null) {
      return;
    }
    System.out.println(details + node.value);
    display(node.left, "Left child of " + node.value + " : ");
    display(node.right, "Right child of " + node.value + " : ");
  }

}





