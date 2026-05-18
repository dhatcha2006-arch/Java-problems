
import java.util.Scanner;

public class MinMaxValueOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min = arr[0];
        for(int i=0;i<n;i++){
            if (min>arr[i]) {
                min=arr[i];
            }
        }
        System.out.println("Min : "+min);

        int max=arr[0];
        for(int i=0;i<n;i++){
            if (max<arr[i]) {
                max=arr[i];
            }
        }
        System.out.println("Max : "+max);
    }
}
