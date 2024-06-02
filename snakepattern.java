import java.util.Scanner;
public class snakepattern {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2 !=0){
                for(int j=1;j<=n;j++){
                    k=k+1;
                    System.out.print(k+" ");

                }
            }
            else if(i%2==0){

                for(int j=1;j<=n;j++){
                    System.out.print(k+" ");
                    k=k-1;
                }
            }
            k=k+n;
            System.out.println();
        }

    }
}
