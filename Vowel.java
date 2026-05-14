//Display the total number of vowels present in the input.

import java.util.*;

public class Vowel{
        public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Word or Sentence : ");
        String a=sc.nextLine();
        int count = 0;
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u'||c=='A'|| c=='E' || c=='I' || c=='O' || c=='U'){
                count++;
            }
        }
        System.out.print("The VOWEL Count is : "+count);

        }

}




