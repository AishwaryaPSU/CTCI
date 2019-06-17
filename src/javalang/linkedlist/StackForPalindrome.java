package javalang.linkedlist;

public class StackForPalindrome {
    private static int[] stack;
    private static int size;
    private static int top;

    public StackForPalindrome(int size){
        this.stack = new int[size];
        this.size = size;
        this.top=-1;
    }

    public static void push(int element){
        if(top>size){
            System.out.println("Stack is full.");
            return;
        }
        stack[++top]=element;
    }

    public static int pop(){
        if(top==-1){
            System.out.println("Stack is empty.");
            return -1;
        }
        return stack[top--];
    }

    public static int topElement(){
        return stack[top];
    }
}
