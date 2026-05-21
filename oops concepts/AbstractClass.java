import java.util.Scanner;

abstract class Parent{
    abstract void area(int area);  // just Declare  // abstract method

    void get(){
        System.out.println("Hello.. this is abstract class normal method ");
    }
}

class Child extends Parent{
    void area(int area){
        System.out.println(area*area);
    }
}

class AbstractClass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int area = sc.nextInt();
        Child s = new Child();
        s.area(area);
        s.get();
    }
}


