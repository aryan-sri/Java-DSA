import java.util.*;

class Stack {
    static int[] data;
    final static int size = 10;
    int pointer = -1;

    Stack(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        if (pointer == data.length) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        return pointer == -1;
    }

    public void push(int val) {
        if (isFull()) {
            System.out.println("The Stack is Full !");
            return;
        }
        pointer++;
        data[pointer] = val;
    }

    public int pop() {
        if(isEmpty())
        {
            return -1;
        }
        return data[pointer--];
    }
    public int peek()
    {
        if(isEmpty())
        {
            return -1;
        }
        return data[pointer];
    }

    public static void main(String[] args) {
        Stack stck  = new Stack(10);
        stck.push(12);
        stck.push(23);
        stck.push(45);
        stck.push(67);
        stck.push(19);

        System.out.println("Peeked " + stck.peek());

        System.out.println(stck.pop());
        System.out.println(stck.pop());
        System.out.println(stck.pop());
        System.out.println(stck.pop());
        System.out.println(stck.pop());
        
    }

}