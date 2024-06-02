public class reversepyramid {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int g=1;g<i;g++){
                System.out.print(" ");
            }
            for(int k=i;k<=n;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
