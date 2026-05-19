
class Student{
    String name;
    int age;
    void get(){
        System.out.println(name);
        System.out.println(age);
    }
}

class Trainer extends Student{
    int trainerId ;
    void details(){
        System.out.println(trainerId);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Trainer obj = new Trainer();
        
        obj.name = "Kumar";
        obj.age  = 100;
        obj.trainerId = 2201;

        obj.details();
        obj.get();
    }
}
