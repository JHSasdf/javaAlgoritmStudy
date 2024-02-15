import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileWriteRunner {
    public static void main(String[] args) throws IOException {
        Path pathFileToWrite = Paths.get("./resources/data.txt");

        List<String> list = List.of("Apple", "Boy", "Dong", "silbver");

        List<String> existingList = new ArrayList<>(Files.lines(pathFileToWrite)
                .map(String::toUpperCase).toList());
        existingList.addAll(list);

        Files.write(pathFileToWrite, existingList);

        Files.lines(pathFileToWrite).map(String::toUpperCase).forEach(System.out::println);

    }
}
