package javalang.stacksandqueues;

import java.util.ArrayList;
import java.util.HashMap;

public class StackOfPlates {
    private HashMap<Integer,Stack> setOfStacks;
    private int threshold;
    private int currentStack;

    public StackOfPlates(int threshold){
        this.threshold = threshold;
        this.setOfStacks = new HashMap<>();
        Stack stack = new Stack(threshold);
        this.currentStack = 1;
        this.setOfStacks.put(currentStack,stack);
    }

    public void push(int data){
        Stack currentStack = setOfStacks.get(0);
    }

}
