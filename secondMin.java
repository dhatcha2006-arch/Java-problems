import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int arr[] = new int[n];

    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int min = arr[0];
    int secMin=arr[0];
    for(int i=0;i<n;i++){
        if(arr[i]<min){
            secMin = min;  
            min=arr[i];
        }
            else if (arr[i] != min && arr[i] < secMin) {
            secMin = arr[i];
        }
    }
    System.out.println(secMin);
    }
}
