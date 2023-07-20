public class Stacks {
    private int Data[];
    protected static final int DEFAULT_SIZE = 10;
     int pointer= 1;
    
     Stacks()
     {
        this(DEFAULT_SIZE);
     }
     Stacks(int size)
     {
        this.Data = new int[size];

     }
     public boolean push(int item)
     {
        if(isFull())
        {
            System.out.println("Stack is Full!!");
            return false;

        }
        Data[pointer++] = item;
        return true;
     }
     private boolean isFull() {
        return pointer == Data.length - 1;
    }
    public int pop()
     {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
            return -1;
        }
        return Data[pointer--];
     }
     private boolean isEmpty() {
        
        return pointer == -1;
    }
    public int Peek()
    {
        return Data[pointer];

    }   
 }
