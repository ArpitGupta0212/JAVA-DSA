
public class size_of_largest_bst_in_bt {
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class info{
        boolean validbst;
        int size;
        int min;
        int max;
        info(boolean validbst,int size ,int min,int max){
            this.validbst=validbst;
            this.size=size;
            this.min=min;
            this.max=max;
        }
    }
    public static void main(String[] args) {
        node  root=new node(50);
        root.left=new node(30);
        root.right=new node(60);
        root.left.left=new node(5);
        root.left.right=new node(20);
        root.right.left=new node(45);
        root.right.right=new node(70);
        root.right.right.left=new node(65);
        root.right.right.right=new node(80);
        size_of_largest_bst(root);
        System.out.println(maxSizeBst);
    }
    static int maxSizeBst=0;
    public static info size_of_largest_bst(node root){
        if(root==null){
            return new info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }
        info leftinfo=size_of_largest_bst(root.left);
        info rightinfo=size_of_largest_bst(root.right);
        int size=leftinfo.size+rightinfo.size+1;
        int min=Math.min(root.data,Math.min(leftinfo.min,rightinfo.min));
        int max=Math.max(root.data,Math.max(leftinfo.max,rightinfo.max));
        if(root.data<=leftinfo.max || root.data>=rightinfo.min){
            return new info(false,size,min,max);
        }
        if(leftinfo.validbst && rightinfo.validbst){
            maxSizeBst=Math.max(maxSizeBst,size);
            return new info(true, size, min, max);
        }
        return new info(false,size,min,max);
    }
}
