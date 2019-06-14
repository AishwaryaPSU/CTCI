package javalang.linkedlist;

public class LinkedList {

    private Node head;

    public LinkedList(){
        head = null;
    }

    public void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    public void print(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for(int i=0;i<5;i++){
            list.add(i+5);
        }
        list.add(5);
        list.add(7);
        list.print();
        list.deleteDups();
        list.print();
    }

    public void deleteDups(){
        Node p1=head;
        Node p2=p1.next;
        while(p1!=null){
            p2=p1.next;
            Node p3=p1;
            while(p2!=null){
               if(p1.data==p2.data){
                   p3.next=p2.next;
               }
               p3=p2;
               p2=p2.next;
           }
            p1=p1.next;
        }
    }
}

class Node{
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next=null;
    }
}
