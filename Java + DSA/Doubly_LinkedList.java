    public class Doubly_LinkedList {
        static Node head;
        static Node tail;
        static int size;
        static class Node{
            int val;
            Node prev;
            Node next;

            Node(int val)
            {
                this.val = val;
            }
            Node(int val ,Node prev, Node next)
            {
                this.val = val;
                this.prev = prev;
                this.next = next;
            }
        }

        public static void insertFirst(int val)
        {
            Node node = new Node(val);
            node.prev = null;
            node.next = head;
            if(head!=null)
            {
                head.prev = node;
            }
            head = node;

            if(tail == null)
            {
                tail = node;
            }
            size++;
        }
        public static void insertLast(int val)
        {
            Node node = new Node(val);
            Node last = head;
            node.next = null;
            if(head == null)
            {
                node.prev = null;
                head = node;
                return;
            }

            while(last.next!= null)
            {
                last = last.next;
            }
            last.next = node;
            node.prev = last;
            size++;
        }
        public static void display()
        {
            Node temp = head;
            Node last = null;
            while(temp!=null)
            {
            System.out.print(temp.val +"->");
            temp = temp.next;
            }
        }

        public static void PrintReverse()
        {
            Node temp = tail;
            while(temp!=null)
            {
                System.out.print(temp.val+"<-");
                temp = temp.prev;
            }
        }

        public static void main(String[] args) {
            Doubly_LinkedList dL = new Doubly_LinkedList();
            dL.insertFirst(12);
            dL.insertFirst(23);
            dL.insertFirst(122);
            dL.insertFirst(67);
            dL.insertLast(27);
            dL.display();
            // dL.PrintReverse();
            
        }
    }
