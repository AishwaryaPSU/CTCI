package javalang.linkedlist;

import com.sun.tools.internal.xjc.util.NullStream;
import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public Node getHead(){
        return head;
    }
    public void setHead(Node head){
        this.head=head;
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
        //list.deleteDups();
        list.deleteDupsWithHM();
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

    public void deleteDupsWithHM(){
        Map<Integer, List<Integer>> hash = addToHM();
        Node p1=null;
        Node p2 =head;
        int i=0;
        while(p2!=null){
            List<Integer> dupArray = hash.get(p2.data);
            if(dupArray.size()>1){
                if(dupArray.contains(i)&&dupArray.get(0)!=i){
                    p1.next=p2.next;
                }
            }
            p1=p2;
            p2=p2.next;
            i++;
        }
    }
    public Map addToHM(){
        Map<Integer, List<Integer>> hash = new HashMap<>();
        Node temp = head;
        int i=0;
        while(temp!= null){
            if(hash.containsKey(temp.data)){
                List<Integer> dataIdx = hash.get(temp.data);
                dataIdx.add(i);
                hash.put(temp.data,dataIdx);
            }else {
                List<Integer> idx = new ArrayList<>();
                idx.add(i);
                hash.put(temp.data,idx);
            }
            i++;
            temp=temp.next;
        }
        System.out.println(hash);
        return hash;
    }
}


