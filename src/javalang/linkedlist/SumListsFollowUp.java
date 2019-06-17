package javalang.linkedlist;

public class SumListsFollowUp {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        list1.add(6);
        list1.add(1);
        list1.add(7);
        list2.add(2);
        list2.add(9);
        list2.add(5);
        list1.print();
        list2.print();
        sum(list1,list2);
    }

    private static void sum(LinkedList l1,LinkedList l2){
        Node p1=l1.getHead();
        Node p2=l2.getHead();
        int listSize=0;
        while(p1!=null){
            ++listSize;
            p1=p1.next;
        }
        p1=l1.getHead();
        Stack stackarray = new Stack(listSize+listSize);
        while(p1!=null){
            stackarray.push(p1.data,p2.data);
            p1=p1.next;
            p2=p2.next;
        }
        System.out.println();
        int sum=0;
        int carry=0;
        p1=l1.getHead();
        while(p1!=null){
            sum=stackarray.pop()+carry;
            if(sum/10==0){
                carry=0;
                p1.data=sum;
            }else {
                carry=sum/10;
                p1.data=sum%10;
            }
            p1=p1.next;
        }
        l1.print();
    }
}
