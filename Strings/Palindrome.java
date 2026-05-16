import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String pal = sc.nextLine();
        String original = pal;
        String rev = "";
        for(int i=pal.length()-1;i>=0;i--){
            rev+=pal.charAt(i);
        }
        if(original.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}