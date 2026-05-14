//Sum of 1 to n numbers--

import java.util.*;
public class Sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a n : ");
        int n = sc.nextInt();
        int i;
        int sum=0;

        for(i=0;i<=n;i++){
            sum=sum+i;
        }

        System.out.print("Sum of 1 to "+n+" is : "+sum);


    }
}