import java.util.Scanner;

public class PalindromeStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String s1 = sc.nextLine();
        StringBuilder s2 = new StringBuilder(s1);
        String rev = s2.reverse().toString();
        
        System.out.println("Before reverse : "+s1);
        System.out.println("After reverse : "+rev);

        
        if(s1.equals(rev)){
            System.out.println("The string is Palindrome");
        }
        else{
            System.out.println(" The string is Not a Palindrome");
        }
        
        
    }
}
