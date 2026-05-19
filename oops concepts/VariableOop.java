class Variable{
    int rollno;
    String name ;   // Instance variable  have a default Value;
    int mark ;
    
    void get(){
        int a =10; // Local Variable  >> Not have default Variable
        int b ;   
        System.out.println(rollno);
        System.out.println(name);
        System.out.println(mark);
        System.out.println(a);
       // System.out.println(b);  // error no default value
    }

    // cannot access local variable outside the method
}

public class VariableOop {
    public static void main(String[] args) {
        Variable obj = new Variable();
        obj.rollno=1;
        obj.get();
    }
}
