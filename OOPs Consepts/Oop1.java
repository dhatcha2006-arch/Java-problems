
class Student{
    String name ;
    int mark;
    void get(){
        System.out.println(name);
        System.out.println(mark);
    }
}

public class Oop1{
    public static void main(String[] args) {
        Student s = new Student();
        s.name="Murugan";
        s.mark=98;
        s.get();
    }
    
}