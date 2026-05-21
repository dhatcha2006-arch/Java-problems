// we can print the method usint the classname.methodname(); this syntax ...

class Mainn{
    static void main(){
        
        System.out.println("Static method print using the classname.staticmethodname();...");
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        Mainn.main();
    }
}
