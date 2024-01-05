/*
it is used to denote constants.if any entity(variables,methods,class)
has declared as final then it can be assigned only ones.that is:
final method can not be overwritten.final class can not be extended.

*/

public class final_keyword {
    public static void main(String[] args) {
        final int a=5;
            a=7;
            System.out.println("a: "+a);

    }
}
