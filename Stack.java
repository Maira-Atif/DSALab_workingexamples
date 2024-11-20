public class Stack {
    private int arr[];
    private int size;
    private int index = 0;

    public Stack(int size){
        this.size = size;
        arr = new int[size];
    } 

    public void push(int element){
        if(isFull()){
            System.out.println("Stack is full");
        }
        arr[index] = element;
        index++;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1; // Return a default value or could throw an exception if needed
        }
        return arr[--index];
    }

    public boolean isEmpty(){ 
        return index == 0;
    }

    public boolean isFull(){  
        return index == size;
    }

    public int size(){
        return index;  
    }
}