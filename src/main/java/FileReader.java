import java.io.*;
import java.util.*;

public class FileReader {

    public List readWords(File FileIsRead){
        List Words=new ArrayList();


        try{
            Scanner s=new Scanner(FileIsRead);

            while (s.hasNext()){
                Words.add(s.next());

            }
        }catch (FileNotFoundException e){
            System.out.println("Error accessing input file!");
        }
        return Words;

    }
}
