import java.util.*;
public class diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n=str.length();
        for(int i=1;i<n;i++){
            for(int g=i;g<n;g++){
                System.out.print("  ");
            }
            for(int s=1;s<=(2*i)-1;s++){
                if(s==1 ||  s==(2*i)-1){
                    char c=str.charAt(i-1);
                    System.out.print(c+" ");
                }else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int g=1;g<i;g++){
                System.out.print("  ");
            }
            for(int s=i;s<=(2*n)-i;s++){
                if(s==i || s==(2*n)-i){
                    System.out.print(str.charAt(i-1)+" ");
                }else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
