public class floydtriangle {
    public static void main(String[] args) {
        int n=5;
        int p=1;
        for(int i=1;i<=n;i++){
            for(int s=1;s<=i;s++){
                System.out.print(p+" ");
                p=p+1;
            }
            System.out.println();
        }
    }
}

