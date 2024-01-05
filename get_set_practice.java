import java.util.Scanner;


class Cylinder{
    private float r;
    private float h;

    public void setradius(float ra){
        r=ra;
    }


    public void sethight(float hei){
        h=hei;
    }
    public String display(){
        return (r +" is the radius and "+ h+" is the height");
    }

    public String getvolume(){
        return ("volume of cylinder is: "+ (3.14*r*r*h));
    }

    
    public void volume(){
        System.out.println("The volume of cylinder is: "+(3.14*r*r*h));
    }
}

public class Harry_get_set_prac{
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the radius:");
        float radi=s.nextInt();
        System.out.println("enter the height:");
        float heig=s.nextInt();
        
        
        Cylinder c=new Cylinder();
        c.setradius(radi);
        c.sethight(heig);
        System.out.println(c.display());
        System.out.println(c.getvolume());
    }
}
