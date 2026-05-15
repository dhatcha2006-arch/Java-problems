//Swichcase

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input : ");
        int n =sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Bad");
                break;
            case 2:
                System.out.println("ok");
            case 3:
                System.out.println("Good");
            case 4:
                System.out.println("Perfect");
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
