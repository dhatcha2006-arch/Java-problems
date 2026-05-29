import java.io.FileWriter;
import java.io.IOException;

public class fileWriting {
    public static void main(String[] args) {
        try{
        FileWriter writer = new FileWriter("Example.txt");
        writer.write("Hello world");
        writer.close();
        System.out.println("Successfully written");
    }
    catch(IOException e){
        System.out.println("Error");
    }
    }
}
