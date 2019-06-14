package javalang.linkedlist;

public class DeleteMiddleNode {
    public static void main(String[] args) {
        LinkedList list =new LinkedList();
        list.add(90);
        list.add(1);
        list.add(23);
        list.add(56);
        list.add(31);
        int mid =23;
        //assuming we have access to the head of the list.
        //deleteByNum(mid,list);
        list.print();
        deleteByNode(list.getHead().next);
        list.print();
    }
    public static void deleteByNum(int mid,LinkedList list){
        Node temp = list.getHead();
        Node p = temp.next;

        while(p.data!=mid){
            temp=p;
            p=p.next;
        }
        if(p!=null&&p.next!=null&&temp.next!=null){
            temp.next=p.next;
        }

    }
    public static boolean deleteByNode(Node nodeToDelete){
        if(nodeToDelete!=null&&nodeToDelete.next!=null){
            nodeToDelete.data=nodeToDelete.next.data;
            nodeToDelete.next=nodeToDelete.next.next;
            return true;
        }
        return false;
    }
}
