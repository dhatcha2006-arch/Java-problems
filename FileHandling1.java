import java.io.File;
import java.io.IOException;
public class FileHandling1 {
    public static void main(String[] args) {
        File file = new File("Example.txt");
        try{
        if(file.createNewFile()){
            System.out.println("File created "+file.getName());
        }
        else{
            System.out.println("file already exist.");
        }
    }
    catch(IOException e){
        System.out.println("An error Accured");
    }

    }
}