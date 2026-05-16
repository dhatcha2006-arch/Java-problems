public class String1 {
    public static void main(String[] args) {
        String a = new String("Hello"); // new --> object 
        String b = "Hello";  // SCP -->> String Constant Pool
        System.out.println(a==b);
        System.out.println(a.equals(b));

        a = "Ram";                              
        b = "Ram "+"Charan";                       /* Compile time */
        System.out.println(a+" "+b);
        System.out.println(b=="Ram Charan");

         a = "Ram";                              
        b =a+" Charan";                       /* Run time */
        System.out.println(b);
        System.out.println(b=="Ram Charan");
        
    }
}
