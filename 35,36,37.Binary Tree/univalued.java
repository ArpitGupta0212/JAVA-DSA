public class univalued {
    static class node{
        int data;
        node right;
        node left;
        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static boolean uni(node root,int x){
        if(root==null){
            return true;
        }
        if(root.data!=x){
            return false;
        }
        return uni(root.left, x) && uni(root.right, x);
    }
    public static void main(String args[]){
        node root=new node(2);
        root.left=new node(2);
        root.right=new node(2);
        root.left.left=new node(4);
        root.left.right=new node(2);
        // root.right.left=new node(6);
        // root.right.right=new node(7);
        System.out.println(uni(root, root.data));
}
}
