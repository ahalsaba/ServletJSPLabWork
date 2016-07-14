/**
 * Created by ahalsaba on 7/14/2016.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class WordList  {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("PrideAndPrejudice.txt"));
        Collection<String> noDups;
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            String[] b = everything.split("\\W+");
            List<String> c = Arrays.asList(b);
           noDups = c.stream().collect(Collectors.toSet());
        } finally {
            br.close();
        }
        System.out.println(noDups);
    }
}
