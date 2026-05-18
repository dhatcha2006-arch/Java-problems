import java.util.Arrays;
import java.util.Scanner;

public class Anagram{
    public static boolean isAnagram(String x , String y){
        if(x.length()!=y.length()){
            return false;
        }
        
        char[] X = x.toCharArray();
        char[] Y = y.toCharArray();

        Arrays.sort(X);
        Arrays.sort(Y);

        return Arrays.equals(X, Y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x = sc.nextLine();
        String y = sc.nextLine();

         if (isAnagram(x, y)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
