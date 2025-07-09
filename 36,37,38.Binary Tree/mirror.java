public class mirror {

        public static void main(String args[]){
            node root1=new node(1);
            root1.left=new node(2);
            root1.right=new node(3);
            root1.left.left=new node(4);
            root1.left.right=new node(5);
            root1.right.left=new node(6);
            root1.right.right=new node(7);
            node root2=new node (1);
            root2.left=new node(3);
            root2.right=new node(6);
            root2.left.left=new node(7);
            root2.left.right=new node(6);
            root2.right.left=new node(5);
            root2.right.right=new node(4);
            // System.out.println(root1.data==root2.data?check(root1,root2):false);
            System.out.println(check(root1, root2));
    }
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
    public static boolean check(node root1,node root2){
        if(root1==null && root2==null){
            return true;
        }
        if(root1==null || root2==null|| root1.data!=root2.data){
            return false;
        }
        if(root1.data==root2.data){
            return true;
        }
    return check(root1.left, root2.right) && check(root1.right, root2.left);
}
}
