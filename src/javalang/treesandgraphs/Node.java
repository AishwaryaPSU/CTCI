package javalang.treesandgraphs;

public class Node {
    private int data;
    private Node llink;
    private Node rlink;

    public Node(int data){
        this.data = data;
        this.llink = null;
        this.rlink = null;
    }

    public int getData(){
        return data;
    }

    public Node getLlink(){
        return llink;
    }

    public Node getRlink(){
        return rlink;
    }

    public void setLlink(Node llink){
        this.llink = llink;
    }

    public void setRlink(Node rlink){
        this.rlink = rlink;
    }

}
