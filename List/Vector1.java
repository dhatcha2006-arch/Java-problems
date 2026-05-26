import java.util.*;

public class Vector1 {
    public static void main(String[] args) {
    Vector<Integer> s = new Vector<>();
    s.add(10);
    s.add(20);
    s.add(30);
    s.add(40);
    System.out.println(s.capacity());
    System.out.println(s.get(0));
    System.out.println(s.size());
    
}
}
