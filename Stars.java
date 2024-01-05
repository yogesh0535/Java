import java.util.Scanner;

import javax.xml.transform.Source;

public class Stars {
/*
    public static void stars(int n){
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void main(String []arg){
        Scanner S = new Scanner(System.in);
        int n=S.nextInt();
        stars(n);
    }
 */
    public static void stars(int n){
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
               System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void main(String []arg){
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n=S.nextInt();
        stars(n);
}
}