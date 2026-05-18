import java.util.Scanner;

public class SecondMinMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    //second Maximum
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                secondMax = max;
                max=arr[i];
            }
            else if(secondMax<arr[i] && arr[i]<max){
                secondMax=arr[i];
            }
            
        }
        System.out.println();
        System.out.println(secondMax);

    //second Minimum
    int min = Integer.MAX_VALUE;
    int secondMin =Integer.MAX_VALUE;
      for(int i=0;i<n;i++){
            if(min>arr[i]){
                secondMin = min;
                min=arr[i];
            }
            else if(secondMin>arr[i] && arr[i]>min){
                secondMin=arr[i];
            }
            
        }
        System.out.println(secondMin);
    }
}
