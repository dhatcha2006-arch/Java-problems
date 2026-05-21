public class StaticBlock {
    static {
        int a =10;
        int b =20;
        int c = a+b;
        System.out.println(c);
        System.out.println("This is my static block..");
    }
    
    public static void main(String[] args) {
        System.out.println("This is my main nethod..");
    }
}
