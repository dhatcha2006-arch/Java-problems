public class FinalVariable {
    public static void main(String[] args) {
        int a = 10;
        a = 50;
        System.out.println(a); // output 50;

        final int b =10 ;
        System.out.println(b);  // print b = 10 ;

        final int c = 20 ;
        c = 10;
        System.out.println(c); // error final answer cannot be changed 
    }
}
