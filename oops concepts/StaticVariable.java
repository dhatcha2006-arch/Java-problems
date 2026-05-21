import java.util.Scanner;

class Student{
    static int roll_no1;
    Student(int roll_no1){
        Student.roll_no1=roll_no1;
    }
    void roll_no(int roll_no2){
        System.out.println(roll_no1+""+roll_no2);
    }
}
public class StaticVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int roll_no1=2303720;
        int roll_no2;
        Student s = new Student(roll_no1);

        for(int i=1;i<=60;i++){
            s.roll_no(i);
        }
        // for(int i=1;i<=60;i++){
        //     System.out.println(s.roll_no2);
        // }
        
    }
}
