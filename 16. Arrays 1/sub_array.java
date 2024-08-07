public class sub_array {
        public static void sub(int num[]){
            int total_sub=0;
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int i=0;i<num.length;i++){
                for(int j=i;j<num.length;j++){
                    int sum=0;
                    for(int k=i;k<=j;k++){
                        System.out.print(num[k]);
                        sum+=num[k];
                        if(sum>max){
                            max=sum;
                        }
                        if(sum<min){
                            min=sum;
                        }
                    }
                    total_sub++;
                    System.out.print("/");
                }
                System.out.println();
            }
            System.out.println(total_sub);
            System.out.println(max);
            System.out.println(min);
        }
        public static void main(String args[]){
            int arr[]={2,4,6,8,10};
            sub(arr);
        }
    }
