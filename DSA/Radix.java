import java.util.Scanner;

public class Radix {

    static void RadixSort(int arr[], int n) {

        // Find the maximum element
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        // Temporary output array
        int output[] = new int[n];

        // Perform Counting Sort for every digit
        for (int exp = 1; (max / exp) > 0; exp *= 10) {

            int count[] = new int[10];

            // Count occurrences of each digit
            for (int i = 0; i < n; i++) {
                count[(arr[i] / exp) % 10]++;
            }

            // Convert count array to prefix sum
            for (int i = 1; i < 10; i++) {
                count[i] += count[i - 1];
            }

            // Build the output array (stable sorting)
            for (int i = n - 1; i >= 0; i--) {
                int digit = (arr[i] / exp) % 10;
                output[count[digit] - 1] = arr[i];
                count[digit]--;
            }

            // Copy output back to original array
            for (int i = 0; i < n; i++) {
                arr[i] = output[i];
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        RadixSort(arr, n);

        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}