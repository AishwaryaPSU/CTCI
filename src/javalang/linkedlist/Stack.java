package javalang.linkedlist;

public class Stack {
    private static int[] stack;
    private static int top;
    private static int size;

    public Stack(int size){
        this.size=size;
        this.stack = new int[this.size];
        this.top=-1;
    }

    public static void push(int a,int b){
        if(top>size){
            System.out.println("Stack is full");
            return;
        }
        stack[++top]=a;
        stack[++top]=b;
    }

    public static int pop(){
        if(top<=-1){
            System.out.println("Stack is empty.\n");
            return -1;
        }
        return stack[top--]+stack[top--];
    }

    public static void print(){
        if(top==-1){
            System.out.println("Stack is empty.\n");
        }
        int current=top;
        while(current!=-1){
            System.out.print(stack[current--]+" ");
        }
    }
}
