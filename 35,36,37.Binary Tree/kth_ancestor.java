public class kth_ancestor{
    public static int ansec(node root,int n,int k){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int left=ansec(root.left, n, k);
        int right=ansec(root.right, n, k);
        if(left==-1 && right==-1){
            return -1;
        }
        int max=Math.max(left, right);
        if(max+1==k){
            System.out.println(root.data);
        }
        return max+1;
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
    public static void main(String args[]){
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);
        root.right.right=new node(7);
        ansec(root,4,2);
}
}