import java.net.SocketTimeoutException;

/*
innerclass or nested class declared inside the class. we use inner class logically to 
group classesor interface in one place to more readable and maintainable.

it is of 4 types:
1.nested inner class: it can access any private instance variable of the outer class.
2. method local inner class:  here inner class can be declared with in a 
                                method of outer class

3. static nested inner class: it is not  tecnical inner classes.they are like a static
                              member of outer class.
4. anonymous inner class

 */

 /*
// 1.nested inner class

class outer{
    private int data =35;
    class inner{
        public void msg(){
            System.out.println("data is: "+data);
        }
        }
    }

public class inner_class {
    public static void main(String []args) {
        outer.inner obj=new outer().new inner();
        obj.msg();
    }
}
*/


/* 
// method local inner class

class outer{
    public void outmethod(){
        System.out.println("inside outer method");
        
        class inner {
            public void msg(){
                System.out.println("inside inner method");
            }
        }
        inner obj=new inner();
        obj.msg();
    }
}
class inner_class{
public static void main(String []arg) {
    outer ob = new outer();
    ob.outmethod();
}
}
*/

// static inner class
class outer{
    private static void outermethod (){
        System.out.println("inside outer method");
    }

    static class inner{
        public static void display(){
            System.out.println("inside inner method");
            outermethod();
        }
    }
}

class inner_class{
    public static void main(String[] args) {
        outer.inner.display();
    }
}