
class Student{
    String name;
    int age;
    Student(String x,int y){
        name = x;
        age = y;
        System.out.println(x+" "+y);
    }
    void get(){
        System.out.println(name+" "+age);
    }
}
public class ParameterCons{
    public static void main(String[] args){
        Student s = new Student("Dhatcha", 21);
        s.get();
    }
}
