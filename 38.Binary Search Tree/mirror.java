public class mirror {
    static class node {
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static void main(String args[]){
        node root= new node(8);
        root.left=new node(5);
        root.right=new node(10);
        root.left.left=new node(3);
        root.left.right=new node(6);
        root.right.right=new node(11);
        preorder(root);
        System.out.println();
        mirrortree(root);
        preorder(root);
    }
    public static node mirrortree(node root){//O(n)
        if(root==null){
            return null;
        }
        node rightmirror=mirrortree(root.left);
        node leftmirror=mirrortree(root.right);
        root.right=rightmirror;
        root.left=leftmirror;
        return root;
    }
    public static void preorder(node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
}
