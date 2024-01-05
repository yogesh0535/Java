import java.util.Scanner;

public class Compa_ope {
    public static void main(String arg[]){
        int a=50;
        System.out.println("Enter the number");
        Scanner S=new Scanner(System.in);
        int b=S.nextInt();

        if(a>b){
            System.out.println("the number entered  is smaller than " +(a));
        }

        else{
            System.out.println("number entered is larger");
        }
    }
}
