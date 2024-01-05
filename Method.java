import java.util.Scanner;

public class Method {
    public static int mysum(int a, int b){
        int c=a+b;
        return c;
    }
    public static void main(String []arg){
        int a=5;
        int b=45;
        // Calc obj=new Calc();
        // obj.mysum(a,b);
         System.out.println(mysum(a,b));
    }
}
