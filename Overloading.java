import java.util.Scanner;

/*
 --> overloading: it is the mechanism of having more than one method of same name
                     or constructor having different objects.

--> constructor overloding:
--> method overloading:

==> operator overloading: overloaded opeator performs more than one function.in java,
                            '+' operator is overloaded .it do es not allow user defined
                            operator overloading. the '+' operator is useed to add 
                            integers and also strings.

 */


/*
// constructor overloading
class sum{
    // int x,y;
    sum(int x,int y){
        System.out.println("sum is: "+(x+y));
    }

    sum(double x,double y){
        System.out.println("sum is: "+(x+y));
    }
}
public class Overloading {
    public static void main(String[] args) {
        // Scanner scan=new Scanner(System.in);
        // int a=scan.nextInt();
        // int b=scan.nextInt();
        sum s1=new sum(6,7);
        sum s2=new sum(3.6 ,6.7);
    }
}
*/


/*
// method overloading

public class Overloading{
    public static void mult(int x, int y){
        System.out.println("the multiplication of numbers is: "+(x*y));
    }
    
    public static void mult(double x,double y){
        System.out.println("the multiplication of numbers is: "+(x*y));

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        double c=scan.nextDouble();
        double d=scan.nextDouble();

        mult(a,b);
        mult(c,d);
    }
}
 */

// operator overloading
class A{
    public void add(int x, int y){
        System.out.println("sum is: "+ (x+y));
    }

    public void add(String s1, String s2){
            System.out.println("string sum is: "+ (s1+s2));
    }
}
public class Overloading{
    public static void main(String[] args) {
        A obj=new A();
        obj.add(23,56);
        obj.add("rahul","harry");
    }
}

