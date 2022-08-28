package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Trees {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left =null;
            this.right = null;
        }
    }
    static Scanner sc= null;
    public static void main(String[] args) {

        sc = new Scanner(System.in);
        Node root = createTree();
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        levelOrder(root);
        System.out.println(countOfNode(root));
        System.out.println(sumOfNodes(root));
        System.out.println(heightOfTree(root));

    }
    public static Node createTree(){

        Node root = null;
        System.out.println("Enter data:");
        int data = sc.nextInt();
        if(data == -1)
            return null;
        root = new Node(data);
        System.out.println("Enter left for data : " + data);
        root.left = createTree();
        System.out.println("Enter right for data : " + data);
        root.right = createTree();
        return root;
    }
    //preOrder traversal
    public static void preorder(Node root){

        if(root==null)
            return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    //inorder traversal
    public static void inorder(Node root){
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    //postorder traversal
    public static void postorder(Node root){
        if (root==null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    //levelOrder traversal after level print new line
    public static void levelOrder(Node root){
        if (root==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()){
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else {
                System.out.print(currNode.data + " ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if (currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }
    //count nodes TimeComplexity: O(N)
    public static int countOfNode(Node root){
        if (root == null){
            return 0;
        }
        int leftNodes = countOfNode(root.left);
        int rightNodes = countOfNode(root.right);
        return leftNodes +rightNodes +1;
    }
    //Sum of Nodes TimeComplexity : O(N)
    public static int sumOfNodes(Node root){
        if (root == null){
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }
    //Height of a tree, TimeComplexity : O(N)
    public static int heightOfTree(Node root){
        if (root == null){
            return 0;
        }
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        int myHeight = Math.max(leftHeight, rightHeight) + 1;
        return myHeight;
    }
}
