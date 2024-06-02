public class butterfly {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<n;i++){
            for(int s=1;s<=i;s++){
                System.out.print(" * ");
            }
            for(int s=i;s<n;s++){
                System.out.print("  ");
            }
            for(int s=i;s<n;s++){
                System.out.print("  ");
            }
            for(int s=i;s<n;s++){
                System.out.print("  ");
            }

            for(int s=1;s<=i;s++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++){
            for(int s=i;s<=n;s++){
                System.out.print(" * ");
            }
            for(int s=1;s<i;s++){
                System.out.print("  ");
            }
            for(int s=1;s<i;s++){
                System.out.print("  ");
            }
            for(int s=1;s<i;s++){
                System.out.print("  ");
            }
            for(int s=i;s<=n;s++){
               {
                    System.out.print(" * ");
                }

            }

            System.out.println();
        }

    }
}
