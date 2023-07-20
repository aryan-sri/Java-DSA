public class Linked_list {
    static Node head;
    static Node tail;
    static int size;
    class Node
    {
        int val;
        Node next;
        Node(int val)
        {
            this.val = val;
        }
        Node(int val, Node next)
        {
  
            this.val = val;
            this.next = next;
        }

    }
    public static void Insert(int val, int index) {

        if(index == 0)
        {
            First_Node(val);
        }
        if(index == size)
        {
            add_Last(val);
        }
        size++;
        
    }

    public static void First_Node(int val)
    {
        Node n = new Node(val);
        n.next = head;
        head = n;
    }
    public static void Display()
    {
        Node temp = head;
        while(temp!= null)
        {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    public static void add_Last(int val)
    {
        if(tail == null)
        {
            First_Node(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;

    }
    public static void main(String args[]) {

        Linked_list l = new Linked_list();
       
        
    }
   

    
