import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int num1 =0;
        while(true){
            int num = sc.nextInt();
                if(num<=0)
                {
                    break;
                }  
                num1=num;           
        }
        System.out.println("Ans : "+num1);
        
        
    }
}
