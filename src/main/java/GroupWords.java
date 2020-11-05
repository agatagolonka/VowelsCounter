import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWords {
    public Map<Integer, List<String>> groupedListOfWords;


    public GroupWords(List<String> listOfWords) {

        Map<Integer, List<String>> groupedListOfWords = listOfWords

                .stream()
                .collect(Collectors.groupingBy(String::length));
        groupedListOfWords
                .forEach((k,v) -> System.out.printf(""));
        this.groupedListOfWords=groupedListOfWords;
        System.out.println(groupedListOfWords);

    }

}

