/*
interface is a ble print of a class. it is used to acheive multiple inheritance and
abstraction . it is declared by the interface keyword.we can have method body in
interface but we have to make it default or satic.In it all the methods are abstract 
by default and all fields are public,static and final by default. 

--> interface cant not used to create object and it cannot have a constructor because
        we cannot create object

-->  class extends class , interface extends interface , class implements interface

 */
interface abc{
    void msg();
    // static int draw(){
    default void draw(){
        System.out.println("hello");
    }
}

class print implements abc{
    public void msg(){
        System.out.println("welcome");
    }
}

public class interfac{
    public static void main(String[] args) {
        print p=new print();
        p.draw();
        p.msg();
    }
}
/* 
interface bycyle{
    void gear();
    void lights();
}

class cycle implements bycyle{
    public void gear(){
        System.out.println("this is gear");
    }

    public void lights(){
        System.out.println("this is lights");
    }
    
}

public class interfac {
    public static void main(String[] args) {
        cycle c=new cycle();
        c.gear();
        c.lights();
        
    }
}
*/


/*
interface bycyle{
    void applybreaks(int decreament);
    void speedup(int increament);
}

class Avoncycle implements bycyle{
    public void horn(){
        System.out.println("hato hato");
    }

    public void applybreaks(int decreament){
        System.out.println("the cycle speed is reduced");
    }

    public void speedup(int increament){
        System.out.println("the cycle speed is increased");
    }
}

public class interfac {
    public static void main(String[] args) {
        Avoncycle obj=new Avoncycle();
        obj.applybreaks(0);
        obj.horn();
        obj.speedup(0);
    }
}
 */