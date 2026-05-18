import java.util.Scanner;
public class SumArrayVal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int sum=0;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
        }
        System.out.println();
         System.out.println("Sum of array : "+sum);
        
    }
}
