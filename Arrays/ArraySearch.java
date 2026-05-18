
import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        int count = 0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Search : ");
        int Key = sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==Key){
                count++;
                System.out.print(i);
                break;
            }
        }     
        if(count==0){
            System.out.println("No element..");
        }
    }
}
