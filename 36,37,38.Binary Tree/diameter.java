public class diameter {
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
    public static void preordertraversal(node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preordertraversal(root.left);
        preordertraversal(root.right);
    }
    public static int heightoftree(node root){
        if(root==null){
            return 0;
        }
        return Math.max(heightoftree(root.left),heightoftree((root.right)))+1;
    }
    // 1 approach
    public static int diameteroftree1(node root){   //O(n^2)
        if(root ==null){
            return 0;
        }
        int lh=heightoftree(root.left);
        int rh=heightoftree(root.right);
        int left_dia=diameteroftree1(root.left);
        int right_dia=diameteroftree1(root.right);
        int self_dia=lh+rh+1;
        return Math.max(Math.max(right_dia, left_dia),self_dia);
    }
    // 2nd approach
    static class info{
        int dia;
        int ht;
        info(int dia,int ht){
            this.dia=dia;
            this.ht=ht;
        }
    }
    public static info diameteroftree2( node root){   //O(n)
        if(root ==null){
            return new info(0,0);
        }
        info left_info=diameteroftree2(root.left);
        info right_info=diameteroftree2(root.right);
        int dia=Math.max(Math.max(left_info.dia,right_info.dia),left_info.ht+right_info.ht+1);
        int hi=Math.max(left_info.ht,right_info.ht)+1;
        return new info(dia,hi);
    }
    public static void main(String[] args) {
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.left.left=new node(9);
        root.left.right=new node(5);
        root.left.right.right=new node(6);
        root.left.right.right.right=new node(7);
        preordertraversal(root);
        System.err.println();
        System.out.println(diameteroftree1(root));
        System.out.println(diameteroftree2(root).dia);
    }
}
