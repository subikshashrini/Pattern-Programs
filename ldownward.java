public class ldownward {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int g=1;g<i;g++){
                System.out.print("  ");
            }
            for(int s=i;s<=n;s++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
