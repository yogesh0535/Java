class Pen{
    String colo;
    String type;
    public void write(){
        System.out.print("we will write here by:");
        System.out.println(this.type +  " pen "); 
    }

}
public class OOPs{
    public static void main(String []arg){
        Pen p1=new Pen();
        p1.colo="black";
        p1.type="gel";
        p1.write();


    }
}