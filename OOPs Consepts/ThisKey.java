
class Student{
    String name;
    int age;
    Student(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println(name+" "+age);
    }
    void get(){
        System.out.println(name+" "+age);
    }
}
public class ThisKey{
    public static void main(String[] args){
        Student s = new Student("Dhatcha", 21);
        s.get();
    }
}
