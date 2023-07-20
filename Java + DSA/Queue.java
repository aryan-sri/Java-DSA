public class Queue {
    int end = 0;
    int Data[];
    static int Default_Size = 5;
    Queue()
    {
        this(Default_Size);
    }
    Queue(int size)
    {
        this.Data = new int[size];
    }
    public void insert(int item)
    {
        if(isFull())
        {
            System.out.println("Queue is Full!!");
        }
        else{
            Data[end] = item;
            end++;
        }

    }
    public int remove()
    {
        if(isEmpty())
        {
            System.out.println("The Queue is Empty !");
            return -1; 
        }
        else{
         int remove = Data[0];
        for(int i =1 ; i<end;i++)
        {
             Data[i-1] = Data[i];
        }
        end--;
        return remove;
    }
         
    }
    private boolean isEmpty() {
        return end == 0;
    }
    private boolean isFull() {
        return end == Data.length;
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.insert(10);
        q.insert(11);
        q.insert(12);
        q.insert(13);
        q.insert(14);
        q.insert(15);

        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove()); 

    }

}
