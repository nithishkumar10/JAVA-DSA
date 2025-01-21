package stackandqueues;

public class CustomStack {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if(this.isFull()){
            System.out.println("Stack is full");
            return false;
        }
        data[++ptr] = item;
        return true;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from the empty stack");
        }
        return data[ptr--];
    }

    public boolean isFull(){
        return (data.length - 1 == this.ptr);
    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot peek from the empty stack");
        }
        return data[ptr];
    }

    private boolean isEmpty() {
        return ptr == -1;
    }

}
