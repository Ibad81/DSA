import java.util.Scanner;

public class Binarytree_use {

    public static Binarytreenode<Integer> input() {
        
        Binarytreenode<Integer> root=null;
        System.out.println("Enter the data");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }

        root = new Binarytreenode<>(data);


        System.out.println("Enter the left for" + data);
        root.left = input();

        System.out.println("Enter the right for " + data);
        root.right = input();
        return root;
    }


    public static void printtree(Binarytreenode<Integer> root){
        if(root == null){

            return;
        }

        String to_be_printed=root.data + "";
        if(root.left!=null){
            to_be_printed+="L:"+root.left.data+",";
        }
        if(root.right!=null){
            to_be_printed+="R:"+root.right.data;
        }
        System.out.println(to_be_printed);
        printtree(root.left);

        printtree(root.right);

//        if(root==null){
//            return;
//        }
//        System.out.println(root.data);
//        printtree(root.left);
//        printtree(root.right);
    }

    public static void main(String[] args) {
        input();
        Binarytreenode<Integer>root = input();
        printtree(root);

    }
}


//    public static void main(String[] args) {
////        Binarytreenode <Integer> root=new Binarytreenode<>(2);
////        Binarytreenode<Integer> node1=new Binarytreenode<>(3);
////        root.left=node1;
////
////        Binarytreenode <Integer> node2 =new Binarytreenode<>(4);
////        root.right=node2;
//    }
//}
