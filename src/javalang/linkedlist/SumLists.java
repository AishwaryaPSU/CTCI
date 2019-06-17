package javalang.linkedlist;

public class SumLists {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        list1.add(9);
        list1.add(9);
        list1.add(8);
        list2.add(5);
        list2.add(9);
        list2.add(2);
        list1.print();
        list2.print();
        //sum1(list1,list2);
        sum2(list1,list2);
    }
    //This method creates a new list and adds the result to it
//    private static void sum1(LinkedList l1,LinkedList l2){
//        Node p1=l1.getHead();
//        Node p2=l2.getHead();
//        LinkedList l3=new LinkedList();
//        int carry=0;
//        int digitSum=0;
//        while(p1!=null||p2!=null){
//            if(p1.next==null&&p2.next!=null){
//                l1.add(0);
//            }else if(p2.next==null&&p1.next!=null){
//                l2.add(0);
//            }
//            digitSum=p1.data+p2.data+carry;
//            if((digitSum/10)==0){
//                carry=0;
//                l3.add(digitSum);
//            }else{
//                l3.add(digitSum%10);
//                carry=digitSum/10;
//            }
//            p1=p1.next;
//            p2=p2.next;
//        }
//        System.out.println("L3 is ");
//        l3.print();
//    }
    //This method will add the digits and store the result in the first list
    public static void sum2(LinkedList l1,LinkedList l2){
        Node p1=l1.getHead();
        Node p2=l2.getHead();
        int carry=0;
        int digitSum=0;
        while(p1!=null||p2!=null){
            if(p1.next==null&&p2.next!=null){
                l1.add(0);
            }else if(p2.next==null&&p1.next!=null){
                l2.add(0);
            }
            digitSum=p1.data+p2.data+carry;
            if((digitSum/10)==0){
                carry=0;
                p1.data=(digitSum);
            }else{
                p1.data=digitSum%10;
                carry=digitSum/10;
            }
            System.out.println("Carry ="+carry+" Sum ="+digitSum);
            if(p1.next==null&&p2.next==null&&carry>0){
                Node p3=new Node(carry);
                p1.next=p3;
                p1=p3;
            }
            p1=p1.next;
            p2=p2.next;
        }
        System.out.println("L1 is ");
        l1.print();
    }
}
