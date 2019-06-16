package javalang.linkedlist;

public class Partition {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(5);
        list.add(10);
        list.add(2);
        list.add(1);
        list.print();
        int partitionElement = 5;
        partition(list,partitionElement);
        list.print();
    }
    //3->5->8->5->10->2->1
    //p1p->p1
    private static void partition(LinkedList list,int partitionElement){
        Node p1=list.getHead();
        Node p1Previous=p1;
        Node temp;
        boolean flag=false;
        while(p1!=null) {
            if (p1.data < partitionElement) {
                p1Previous = p1;
                p1 = p1.next;
            }
            if (p1.data >= partitionElement) {
                Node p2 = p1.next;
                Node p2Prev = p1;
                while (p2 != null) {
                    if (p2.data >= partitionElement) {
                        p2Prev = p2;
                        p2 = p2.next;
                    } else {
                        temp = p2;
                        p2Prev.next = p2.next;
                        p1Previous.next = temp;
                        temp.next = p1;
                        //p2Prev = p2;
                        //p2 = p2.next;
                        flag=true;
                        break;
                    }
                }
            }
            list.print();
            if(flag){
                flag=false;
                p1Previous=p1Previous.next;
                p1=p1Previous.next;
                continue;
            }
            p1Previous = p1;
            p1 = p1.next;
        }
    }
}
