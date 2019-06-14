package javalang.linkedlist;

public class ReturnKthToLast {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for(int i=0;i<10;i++){
            list.add(i+i*2);
        }
        list.print();
        int k =10;
        //deleteKthNode(list,k);
        Node kthNode = findKthNode(list,k);
        System.out.println(String.format("Kth node from the end %s",kthNode.data));
    }
    public static void deleteKthNode(LinkedList list,int k){
        Node p1= list.getHead();
        Node p2= list.getHead();
        int j =0;
        while(j<k){
            p1=p1.next;
            j++;
        }
        while(p1!=null&&p1.next!=null){
            p2=p2.next;
            p1=p1.next;
        }

        if(p2==list.getHead()){
            list.setHead(p2.next);
        }else{
            p2.next=p2.next.next;
        }
        list.print();
    }
    public static Node findKthNode(LinkedList list,int k) {
        Node p1 = list.getHead();
        Node p2 = list.getHead();
        int j = 0;
        while (j < k) {
            p1 = p1.next;
            j++;
        }
        while (p1 != null && p1.next != null) {
            p2 = p2.next;
            p1 = p1.next;
        }
        if(p2==list.getHead()){
            return p2;
        }
        return p2.next;
    }
}
