public class palindromic {
        public static void main(String args[]){
            int n=5,count=0;
            for(int i=1;i<=n;i++){
                count=i;
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print(count);
                    count--;
                }
                for (int j = 2; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
