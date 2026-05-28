import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer,String> list = new HashMap<>();
        list.put(1,"Hello");
        list.put(2,"World");
        list.put(3,"One");
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.remove(1));
    }
}
