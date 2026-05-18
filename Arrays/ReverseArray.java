// Reverse a array values

import java.util.*;
public class ReverseArray {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print ("Array = ");
        for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
        }

        System.out.println();
        
        System.out.print("Reversed Array = ");
        for(int i=n-1;i>=0;i--){
           System.out.print(+arr[i]+" ");
        }
        
        
    
}

}
