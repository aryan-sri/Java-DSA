import java.util.Scanner;

public class Binary_tree {
    
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

    public void populate(Scanner scanner)
    {
        System.out.println("Enter the root Node");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }
    public void populate(Scanner scanner, Node node)
    {
        System.out.println("Do you want to insert left of "+ node.val);
        boolean left = scanner.nextBoolean();
        if(left)
        {
            System.out.println("Enter the value for left of Node "+ node.val);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }
        
        System.out.println("Do you want to insert right of "+ node.val);
        boolean right = scanner.nextBoolean();
        if(right)
        {
            System.out.println("Enter the value for right of Node "+ node.val);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }



    }
    
    public void display() {
    display(this.root, "");
    }

    private void display(Node node, String indent) {
    if (node == null) {
      return;
    }
    System.out.println(indent + node.val);
    display(node.left, indent + "\t");
    display(node.right, indent + "\t");
  }



}
