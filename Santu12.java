public class Santu12 {
    public static boolean is_prime(int n) {
        for(int i = 2; i<=n/2;i++) {
            if (n%1==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        for (int i=2;i<=100;i++){
            if(is_prime(i)){
                System.out.print(i + "<-" +"\n");
            }
            else{
                System.out.print(i + "\n");
            }
        }
    }
}
