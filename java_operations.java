import java.util.Scanner;

import javax.print.PrintException;
import javax.sound.sampled.SourceDataLine;

public class java_operations {
    public static void main (String[] args) {
        // int a, b;
        // System.out.println("Enter the value of a and b respectively:");
        // Scanner S=new Scanner(System.in);
        // int a=S.nextInt();
        // Scanner t=new Scanner(System.in);
        // int b=t.nextInt();
        

        // System.out.println("a+b is: " + (a+b));
        // System.out.println("a-b is: " + (a-b));
        // System.out.println("a*b is: " + a*b);
        // System.out.println("a/b is: " + a/b);
        // System.out.println("a%b is: " + a%b);
        // System.out.println(7/4*9/2);
        
        // float f=(7/4*9/2);
        // System.out.println(f);

        System.out.println("enter initial speed");
        Scanner S=new Scanner(System.in);
        float v=S.nextInt();
        
        System.out.println("enter final speed");
        Scanner T=new Scanner(System.in);
        float u=T.nextInt();
        
        System.out.println("enter accerelation speed");
        Scanner W=new Scanner(System.in);
        float a=W.nextInt();
        
        System.out.println("enter the diastance");
        Scanner X=new Scanner(System.in);
        float s=X.nextInt();

        float r=(v*v-u*u)/2*a*s;
        System.out.println(r);
 

        
}
}
