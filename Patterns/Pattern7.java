/*
    2
    2 4
    2 4 6
    2 4 6 8
*/

import java.util.*;
public class Pattern7{ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            int num = 2 ;
            for(j=1;j<=i;j++){
                System.out.print(num+" ");
                num = num + 2 ; 
            }
            System.out.println();
        }
    }
}
