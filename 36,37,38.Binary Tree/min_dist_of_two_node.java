public class min_dist_of_two_node {
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
        public static node lca2(node root,int n1,int n2){
            if(root==null || root.data==n1 ||root.data==n2){
                return root;
            }
            node left_lca2=lca2(root.left,n1,n2);
            node right_lca2=lca2(root.right, n1, n2);
            if(left_lca2==null){
                return right_lca2;
            }
            if(right_lca2==null){
                return left_lca2;
            }
            return root;
        }
        public static int lca_to_node_dist(node root,int n){
            if(root==null){
                return -1;
            }
            if(root.data==n){
                return 0;
            }
            int left_dist=lca_to_node_dist(root.left, n);
            int right_dist=lca_to_node_dist(root.right, n);
            if(left_dist==-1 && right_dist==-1){
                return -1;
            }
            int max=Math.max(left_dist,right_dist);
            return max+1;
            // else if(left_dist==-1){
            //     return right_dist+1;
            // }
            // else{
            //     return left_dist+1;
            // }
        }
        public static int min(node root,int n1,int n2){
            node lca=lca2(root,n1,n2);
            int dist1=lca_to_node_dist(lca,n1);
            int dist2=lca_to_node_dist(lca,n2);
            return dist1+dist2;
        }
    public static void main(String args[]){
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);
        root.right.right=new node(7);
        System.out.println(min(root,4,7));
}}
