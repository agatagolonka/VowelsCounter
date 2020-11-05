import java.util.List;
import java.util.*;


public class AnalyzeWords {

    public List<String> groupOfWords;
    public Boolean isA;
    public Boolean isE;
    public Boolean isI;
    public Boolean isO;
    public Boolean isU;
    public Boolean isY;
    public Integer amountOfVowels;
    public String listOfVowels;
    public Double averageOfVowels;

    public AnalyzeWords(List<String> groupOfWords) {

        this.groupOfWords=groupOfWords;
        this.isA = false;
        this.isE = false;
        this.isI = false;
        this.isO = false;
        this.isU = false;
        this.isY = false;
        this.listOfVowels="";
        this.amountOfVowels = 0;
        this.averageOfVowels = null;

        char analyzeLetter = ' ';

       for (int i = 0; i < groupOfWords.size(); i++) {
            for(int j = 0; j< groupOfWords.get(i).length();j++){

                analyzeLetter = groupOfWords.get(i).charAt(j);

                if (analyzeLetter == 'a' || analyzeLetter == 'A') {
                    this.isA = true;
                    this.amountOfVowels++;
                }
                if (analyzeLetter == 'e' || analyzeLetter == 'E') {
                    this.isE = true;
                    this.amountOfVowels++;
                }
                if (analyzeLetter == 'i' || analyzeLetter == 'I') {
                    this.isI = true;
                    this.amountOfVowels++;
                }
                if (analyzeLetter == 'o' || analyzeLetter == 'O') {
                    this.isO = true;
                    this.amountOfVowels++;
                }
                if (analyzeLetter == 'u' || analyzeLetter == 'U') {
                    this.isU = true;
                    this.amountOfVowels++;
                }
                if (analyzeLetter == 'y' || analyzeLetter == 'Y') {
                    this.isY = true;
                    this.amountOfVowels++;
                }

            }

        }
       this.averageOfVowels = Double.valueOf(this.amountOfVowels)/groupOfWords.size();


       if (this.isA){
           this.listOfVowels=this.listOfVowels+"a, ";
       }
        if (this.isE){
            this.listOfVowels=this.listOfVowels+"e, ";
        }
        if (this.isI){
            this.listOfVowels=this.listOfVowels+"i, ";
        }
        if (this.isO){
            this.listOfVowels=this.listOfVowels+"o, ";
        }
        if (this.isU){
            this.listOfVowels=this.listOfVowels+"u, ";
        }
        if (this.isY){
            this.listOfVowels=this.listOfVowels+"y, ";
        }
        if(this.listOfVowels.length()>0){
            this.listOfVowels=this.listOfVowels.substring(0, this.listOfVowels.length()-2);
        }
    }
}
