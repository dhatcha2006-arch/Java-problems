import java.util.Scanner;

interface A {
    void get(); // using interface only declare // con't use defenition
    int add(int a);
} 
class B implements A{
   public void get(){
        System.out.println("Pure Abstraction...!");
    }
    public int add(int a){
        int b =a;
        int c = a+b;
        //System.out.println(c);
        return c;
    }
}  

public class Interface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        B s = new B();
        s.get();
        System.out.println(s.add(a));
            }
}
