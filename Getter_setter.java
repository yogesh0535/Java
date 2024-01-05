class Employee{
    private String name;

    public void setname(){
        this.name="your name";
    }

    public String getname(){
        return name;
    }

    
}

public class Getter_setter {

    public static void main(String arg[]){
    
        Employee e1=new Employee();
        e1.setname();
        System.out.println(e1.getname());
    }
    
}
