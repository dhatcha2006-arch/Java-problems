
import java.util.Scanner;
public class SwithCase2{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input : ");
        String signal =sc.next();
        switch (signal) {
            case "red":
                System.out.println("Stop");
                break;
            case "green":
                System.out.println("Go");
                break;
            case "yellow":
                System.out.println("Wait");
                break;
            case "Red":
                System.out.println("Stop");
                break;
            case "Green":
                System.out.println("Go");
                break;
            case "Yellow":
                System.out.println("Wait");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}

