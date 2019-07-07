package javalang.stacksandqueues;
//Stack min implemented using an extra data structure: array
public class StackMin {
    public static void main(String[] args) {
        int size = 10;
        System.out.println("Creating stack of size "+size+" ...");
        Stack stack = new Stack(size);
        stack.display();
        stack.push(3);
        stack.push(9);
        stack.push(2);
        stack.push(7);
        stack.push(1);
        stack.display();
        System.out.println("Current Minimum is "+stack.getMin());
        System.out.println("Top of the stack contains the element "+stack.getTopValueOfStack());
        stack.pop();
        System.out.println("Top of the stack contains the element "+stack.getTopValueOfStack());
        System.out.println("Current Minimum is "+stack.getMin());
        stack.pop();
        System.out.println("Current Minimum is "+stack.getMin());
    }
}
