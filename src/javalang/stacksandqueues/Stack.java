package javalang.stacksandqueues;

public class Stack {
    private static int top;
    private static int[] stackArray;
    private static int size;

    public Stack(int size){
        this.size =size;
        this.stackArray = new int[this.size];
        this.top = -1;
    }


    public void display(){
        for(int i=top;i>-1;i--){
            System.out.println("Stack has element "+stackArray[i]+" at position "+i);
        }
    }

    public void push(int data){
        if(top==size-1){
            System.out.println("Stack is full. Cannot add more items.");
            return;
        }
        stackArray[++top]=data;
    }


    public void pop(){
        if(top==-1){
            System.out.println("Stack is empty.Nothing to pop.");
            return;
        }
        System.out.println("Removing item "+stackArray[top]+" from the stack.");
        top--;
    }

    public int getTop(){
        return stackArray[top];
    }

}
