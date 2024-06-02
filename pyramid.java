public class pyramid {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int g=i;g<n;g++){
                System.out.print(" ");
            }
            for(int s=1;s<=i;s++){

                    System.out.print(" *");

            }
            System.out.println();
        }
    }
}
