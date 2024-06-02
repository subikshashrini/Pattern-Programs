public class hillpattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int g=i;g<=n;g++){
                System.out.print(" ");
            }
            for(int s=1;s<=i;s++){
                System.out.print(" *");
            }
            for(int k=i;k<n;k++){
                System.out.print(" ");
            }
            for(int k1=i;k1<n;k1++){
                System.out.print(" ");
            }
            for(int s1=1;s1<=i;s1++){
                System.out.print(" *");
            }

            System.out.println();
        }
    }
}
