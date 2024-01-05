import java.util.Scanner;


class circle{
     public float r;
     public float h;
     public void area(float x,float y){
        r=x;
        h=y;
        System.out.println("area of circl is: "+(3.14*r*r));
     }
     
}

class cylinder extends circle{
    
    public void sethight(float heig){
        h=heig;
    }

    public void setradius(float rad){
        r=rad;
    }
    
    public void area(){
        System.out.println("the area of cylinder is: "+ (3.14*r*r*h));
    }
}


public class Inheritance {
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the radius: ");
        float radi=s.nextFloat();
        System.out.println("Enter the height: ");
        float height=s.nextFloat();

        circle c1=new circle();
        c1.area(radi, height);
        
        cylinder c2=new cylinder();
        c2.sethight(height);
        c2.setradius(radi);
        c2.area();
    }
}
