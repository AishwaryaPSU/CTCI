package javalang.linkedlist;

public class LoopInLinkedList {

    public static void main(String args[]){
            LinkedList list = new LinkedList();
            int n=7;
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            list.add(6);
            list.add(3);

//          list.print();
//            Node p1=list.getHead();
//            Node p2=null;
//            while(p1.next!=null){
//                if(p1.data==3){
//                    p2=p1;
//                    p2.next=p1.next;
//                }
//                p1=p1.next;
//            }
//        System.out.println("P1 next ="+p1.next);
//            p1.next=p2;
//        System.out.println("P1 data ="+p1.data+" P2 data ="+p2.data);
////            list.print();
//            //int loopStartNode = startOfLoop(list);
//
        }

    private static int startOfLoop(LinkedList l1){
            Node p1=l1.getHead();
            Node p2=null;
            while(true){
                if(p2.next==p1){
                    return p1.data;
                }else{
                    p2=p1;
                    p1=p1.next;
                }
            }
    }
}
