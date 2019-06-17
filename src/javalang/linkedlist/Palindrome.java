package javalang.linkedlist;

public class Palindrome {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(3);
        list.add(9);
        list.add(89);
        list.add(3);
        list.add(1);
        int listLegth=listLength(list);
        System.out.println(isPalindrome(list,listLegth));
    }

    private static boolean isPalindrome(LinkedList l,int length){
        int stackSize = length/2;
        StackForPalindrome stack = new StackForPalindrome(stackSize);
        Node p1=l.getHead();
        while(stackSize>0){
            stack.push(p1.data);
            p1=p1.next;
            stackSize--;
        }
        if(length%2!=0){
            p1=p1.next;
        }
        while(p1!=null){
            if(stack.pop()!=p1.data){
                return false;
            }else {
                p1=p1.next;
            }
        }
        return true;
    }
    private static int listLength(LinkedList l){
        int length=0;
        Node p1=l.getHead();
        while(p1!=null){
            length++;
            p1=p1.next;
        }
        return length;
    }
}
