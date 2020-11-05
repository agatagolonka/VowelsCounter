import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteToFile {

    String lineToWrite;
    PrintWriter printWriter;

    public WriteToFile() {
            PrintWriter printWriter = null;
            this.printWriter = printWriter;

            try {
                printWriter = new PrintWriter("file.txt");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            printWriter.close();
        }

        public void addLineToFile(String lineToWrite) throws IOException {
            this.lineToWrite=lineToWrite;

            Path path = Paths.get("file.txt");

            Path write = Files.write(path, lineToWrite.getBytes(), StandardOpenOption.APPEND);

        }

}
