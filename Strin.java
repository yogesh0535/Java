import java.util.Scanner;

public class Strin {
public static void main(String []arg){
        Scanner S=new Scanner(System.in);
        String name=S.next();

        System.out.println(name.toLowerCase());
        System.out.println(name.replace(' ', '_'));
    }
}
