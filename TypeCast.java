public class TypeCast {
    public static void main(String[] args) {
        byte a=100;
        byte b=29;
        b+=a;              // using += --> assignment operator to typecast
        System.out.println(b);

        int c = 1;
        char ch = 'A';
        c+=ch;  // same here
        System.out.println(c);

        int d = 1;
        char ch1 = 'A';
        ch1+=d;
        System.out.println(ch1);

    }
}
