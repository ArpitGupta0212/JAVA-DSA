public class subtree {
    static class node{
        int data;
        node right;
        node left;
        node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    public static boolean identical(node root,node subtree_root){
        if(root==null && subtree_root==null){
            return true;
        }
        else if(root==null||subtree_root==null || root.data!=subtree_root.data){
            return false;
        }
        if(!identical(root.left, subtree_root.left)){
            return false;
        }
        if(!identical(root.right, subtree_root.right)){
            return false;
        }

        return true;
    }
    public static boolean check(node root,node subtree_root){
        if(root==null){
            return false;
        }
        if(root.data==subtree_root.data){
            if(identical(root,subtree_root)){
                return true;
            }
        }

        return check(root.left,subtree_root) || check(root.right, subtree_root);
    }
    public static void preorderdisplay(node root){ //O(n)
        if(root ==null){
            return;
        }
        System.out.print(root.data+" ");
        preorderdisplay(root.left);
        preorderdisplay(root.right);
    }
    public static void main(String args[]){
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.right=new node(6);
        node subtree_root=new node(2);
        subtree_root.left=new node(4);
        subtree_root.right=new node(5);
        System.out.println(check(root, subtree_root));
    }
}
