//Find Whether a Number is Prime or Not...

import java.util.*;
public class PrimeNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int i;

        for(i=2;i<num/2;i++){
            if(num%i==0){
                System.out.print(num+" is NOT a PrimeNumber..!");
                return;
            }      
        }
        System.out.print(num+" is PrimeNumber..!");
        
    }
}
