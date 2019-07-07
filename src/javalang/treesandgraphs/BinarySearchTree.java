package javalang.treesandgraphs;

public class BinarySearchTree {

    Node root;

    public BinarySearchTree(){
        this.root = null;
    }

    public BinarySearchTree(int data){
        System.out.println(String.format("Creating BST with initial root node having data %s",data));
        this.root  = new Node(data);
    }

    public void addNode(int data){
        Node newNode = new Node(data);
        if(root==null){
            root = newNode;
            return;
        }
        Node temp = root;
        Node previous = temp;
        while(temp!=null){
            previous = temp;
            if(temp.getData()>data){
                temp = temp.getLlink();
            }else {
                temp = temp.getRlink();
            }
        }
        if(previous.getData()>data){
            previous.setLlink(newNode);
        }else {
            previous.setRlink(newNode);
        }
    }

    public void inOrder(Node temp){
        if(temp==null)return;
        inOrder(temp.getLlink());
        System.out.println(temp.getData());
        inOrder(temp.getRlink());
    }

    public void preOrder(Node temp){
        if(temp==null)return;
        System.out.println(temp.getData());
        preOrder(temp.getLlink());
        preOrder(temp.getRlink());
    }

    public void postOrder(Node temp){
        if(temp==null)return;
        postOrder(temp.getLlink());
        postOrder(temp.getRlink());
        System.out.println(temp.getData());
    }

    public int height(Node temp){
        if(temp==null)return 0;
        int leftHeight=height(temp.getLlink());
        int rightHeight=height(temp.getRlink());
        int height = max(leftHeight,rightHeight)+1;
        return height;
    }

    public int max(int lheight,int rheight){
        if(lheight>rheight)return lheight;
        return rheight;
    }

    public Node getRoot(){
        return root;
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.addNode(10);
        bst.addNode(90);
        bst.addNode(8);
        bst.addNode(56);
        bst.addNode(0);
        bst.addNode(-10);
        System.out.println("Inorder traversal.");
        bst.inOrder(bst.getRoot());
        System.out.println("Post order traversal.");
        bst.postOrder(bst.getRoot());
        System.out.println("Pre order traversal.");
        bst.preOrder(bst.getRoot());
        System.out.println(String.format("Height of the tree is %s ",bst.height(bst.getRoot())));

    }
}
