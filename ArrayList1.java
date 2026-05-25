import java.util.*;
public class ArrayList1{
    public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        
        System.out.println(list);
        
        for(int value:list){
            System.out.println(value);
        }
    }
}
