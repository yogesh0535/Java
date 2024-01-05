/*
abstract class: we use abstract keyword to declare abstact class.
abstract method: a method that does not have its body.
*/
abstract class language{
    abstract void method1();
    public void display(){
        System.out.println("i am abstract class");
    }
}

class test1 extends language{
    public void method1(){
        System.out.println("it am abstract method");
    }
}


public class abstraction {
    public static void main(String[] args) {
        test1 t=new test1();
        t.method1();
        t.display();
    }
}
