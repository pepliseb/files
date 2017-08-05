import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Main {


     private static String readData(String path) {
//         uzyskujemy obiekt dostepu do pliku na podstawi sxiezki path
         Path filePath = Paths.get(path);
         String data = "" ;
         try {
              byte[] bytes = Files.readAllBytes(filePath);

              data = new String(bytes);

         } catch (IOException ex) {
             System.out.println(" nie udało sie wczytac pliku");
             ex.printStackTrace();
         }
         return data;
     }


     private static void saveToFile(List<String> lines, String path) throws IOException {
         Path filePath = Paths.get(path);

         try (BufferedWriter writter = Files.newBufferedWriter(filePath)) {
             for (String line : lines) {
                 writter.write(line);
                 writter.newLine();
             }
//             writter.close();
//         }

         }
     }
    public static void main(String[] args) {
	// write your code here
        List<String> lines = Arrays.asList("ddddd","kotek","asd123asdagsdasdad");
        String content = readData("C:\\Users\\WTG\\workspace\\filesAndRegex\\src\\data.txt");
        System.out.println(content);

        try {
            saveToFile(lines, "newFile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(" File has been created and all ");
    }
}
