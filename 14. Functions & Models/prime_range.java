public class prime_range {
    public static boolean isprime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }    
    public static void prime_range1(int n){
        for(int i=2;i<n;i++){
            boolean range=isprime(i);
            if(range==true){
                System.out.print(i+" ");
            }
        }        
    } 
    public static void main(String args[]){
        prime_range1(20);
    }  
}
