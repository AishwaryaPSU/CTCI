package javalang.linkedlist;

public class Intersection {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
//        l1.add(5);
//        l1.add(6);
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(0);
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l1.print();
        l2.print();
        System.out.println("The Linked List L1 intersects L2 at position :"+intersectAt(l1,l2));
    }

    private static int intersectAt(LinkedList l1,LinkedList l2){
        Node p1 = l1.getHead();
        Node p2 = l2.getHead();
        int pointOfIntersection =0;
        int counter =0;
        boolean check =false;
        while(p1!=null&&p2!=null){
            counter++;
            Node p3 =p1;
            while(p2!=null||p3!=null){
                if(p3.data==p2.data){
                    pointOfIntersection++;
                    counter++;
                    p3=p3.next;
                    p2=p2.next;
                }else {
                    counter=counter-pointOfIntersection;
                    pointOfIntersection=0;
                    p2=l2.getHead();
                    break;
                }
            }
            p1=p1.next;
        }
        System.out.println("Counter ="+counter+" PointOfIntersection ="+pointOfIntersection);
        if(pointOfIntersection!=0)
            return counter-pointOfIntersection;
        else return pointOfIntersection;
    }
}
