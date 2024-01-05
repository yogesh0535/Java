import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

/*  it is created with the same name of class. it does not have any return type.
   A constructor is a block of code similar to method that is used to initialise the object.
    it can not be abstract ,static and final,it can be pivate,public or protcted.
    there is 2 types of constructors:
 */


 /*
// -->Default constructor: it does not have any argument.
class messege{
    messege(){
    System.out.println("it is constructor method");    
    }
}
public class constructor {
 
    public static void main(String[] args) {
        messege msg=new messege();
    }
}
 */



/* 
//--> Parameterized constructor: it have some arguments. it is used to provide different or same values
//   to distrinct objects.

class student{
    student(String x,int y){
        System.out.println("the name is: "+x.toUpperCase()+" and the roll number is: "+y);
    }
}
public class constructor {
    public static void main(String[] args) {
        System.out.println("Enter the name and rollnumber of the student: ");
        Scanner scan=new Scanner(System.in);
        String name=scan.nextLine();
        int roll_no=scan.nextInt();

        student s1=new student(name,roll_no);

    }
}
*/



/*
 // --> copy constructor: there is no copy constructor in java. We can copy the value from object 
                            to another same as the copy constructor in c++.
*/
class student{
    int id;
    String name;
    student(int i,String n){
        id=i;
        name=n;
    }

    student(student){

    }
}
public class constructor{
    public static void main(String[] args) {
        
    }
}




















                            













