// Using .inter() .. change into the SCP  -- String Constant pool

public class StringMethods {
    public static void main(String[] args) {
        String s1 = new String("Hello");  // object Store in heap memory
        String s2 = s1.intern();  // Change s1 object refece to scp 
        String s3 = "Hello";   //str litrals
        System.out.println(s1==s3);
        System.out.println(s2==s3);

        // method --> object is manditory

        //.length (method)
         System.out.println(s3.length());

        // charAt() --> Print a specific Charactor   * Its also count Space
        System.out.println(s3.charAt(0));
        int n = s3.length();
        System.out.println(s3.charAt(n-1));

        //Substring >> use for String of Substring start and end;
        System.out.println(s3.substring(1));
        System.out.println(s3.substring(1,5));

        //Contains >> Having or Not check
        System.out.println(s3.contains("Hell"));
        String s4 = "Hello one";
        System.out.println(s4.contains(s3));

        //Replace >> replace the values
        System.out.println(s4.replace('o', 'x'));  // Hello one ==> Hellx xne changed
        System.out.println(s4.replace(s4,s3));
        
        //Syncronize one by one steps  Ex : Bank
        //Aysncronize unEven Tasks     Ex : Games

        //Concat  --> concat the Strings
        String s1 = "Hello";
        s1=s1.concat("One");
        System.out.println(s1);   // o/p ---> Hello One

        //.toStrig -- change to string
    }
}
