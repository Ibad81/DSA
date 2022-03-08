import java.util.Scanner;

public class Tree_by_nodes {

    public static void main(String[] args) {
        Node root=createtree();
        createtree();
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
    }

    static Node createtree(){
        Node root=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Data ");
        int data=sc.nextInt();
        if(data==-1){
            return null;
        }
        root=new Node(data);

        System.out.println("Enter left for "+data);
        root.left=createtree();

        System.out.println("Enter Right for "+data);
        root.right=createtree();
        return root;
    }

    static void inorder(Node root){
        if (root == null)return ;
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }
    static void preorder(Node root){
        if(root==null)return;
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    static void postorder(Node root){
        if(root==null)return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }

}


class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
    }
}