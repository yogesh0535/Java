import java.util.Scanner;

/*  an Anonymous_object is the object which has no reference. it can be used at the time of object
    creation only.

*/
class factorial{
    void fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        System.out.println("the factorial is: "+f);
    }
}

public class Anonymous_object {
    public static void main(String[] args) {
        System.out.println("enter the number: ");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();

         new factorial().fact(num);   // Anonymous_object created
    }
}
