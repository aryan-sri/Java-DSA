public class Linked_List_2 {
    static Node head;
    static Node tail;
    static int size;
    public static class Node
    {
        int value;
        Node next;
        public Node(int val)
        {
            this.value = val;
            this.next = null;
        }
        public Node(int val, Node next)
        {
            this.value = val;
            this.next = next;
        }
    }
    public static void Display()
    {
          Node temp = head;
          while(temp!=null)
          {
             System.out.print(temp.value +"->");
             temp = temp.next;
          }
    }
    public static boolean isEmpty()
    {
         return size == 0;
    }
    public static void insertLast(int val)
    {
        if(tail == null)
        {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size+=1;

    }
    public static void insertFirst(int val)
    {
       Node node = new Node(val);
       node.next = head;
       head = node;    

       if(tail == null)
       {
        tail = head;
       }
       size += 1;
    }
    public static Node get(int index)
    {
        Node temp = head;
       for(int i =0;i<index;i++)
       {
        temp = temp.next;
       }
       return temp;
    }
    public static int Delete(int index)
    {
        if(size<=1)
        {
            deleteFirst();
            return -1;
        }
        Node JustbeforeIndex = get(index-1);
        int val = JustbeforeIndex.next.value;
        JustbeforeIndex.next = JustbeforeIndex.next.next;
        size--;
        return val;

    }
    public static void insert(int index, int val) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index. Cannot insert at index " + index);
            return;
        }
        
        if (index == 0) {
            insertFirst(val); 
            return;
        }
        
        if (index == size) {
            insertLast(val);
            return;
        }
    
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
    
        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }
    public static int deleteFirst()
    {
        if(isEmpty())
        {
            return -1;
        }
        int val = head.value;
        head = head.next;
        if(head == null)
        {
            tail = null;
        }
        size--;
        return val;
    }
    public static void main(String[] args) {
        
        Linked_List_2 list = new Linked_List_2();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        // list.insert(2, 12);
        // list.deleteFirst();
        // list.Delete(3);
        list.Display();
        
    }

}
