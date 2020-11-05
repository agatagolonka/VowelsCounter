import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.lang.*;

public class GolonkaVowels {
    public static void main(String[] args) throws IOException {
        List test=new ArrayList();

        List<String> listOfWords=new ArrayList<String>();
        AnalyzeWords analyzedGroupOfWords= null;
        GroupWords groupedWords = null;
        ArrayList keyList = null;
        String lineToWrite = null;
        WriteToFile outputFile = new WriteToFile();

        Integer key =null;


        File file=new File("src/main/resources/testVowels.txt");
        FileReader fi = new FileReader();
        listOfWords=fi.readWords(file);

        groupedWords = new GroupWords(listOfWords);
        keyList= new ArrayList(groupedWords.groupedListOfWords.keySet());


        for (int i = keyList.size() - 1; i >= 0; i--){
            key = (Integer) keyList.get(i);
            analyzedGroupOfWords=new AnalyzeWords(groupedWords.groupedListOfWords.get(key));
            lineToWrite=("({"+analyzedGroupOfWords.listOfVowels+"},"+key+") -> "+analyzedGroupOfWords.averageOfVowels+System.lineSeparator());
            outputFile.addLineToFile(lineToWrite);

        }

    }
}
