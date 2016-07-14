import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;

/**
 * Created by ahalsaba on 7/14/2016.
 */
public class Concordance {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("PrideAndPrejudice.txt"));
        HashMap hm = new HashMap();
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
            for (int i =0; i<b.length; i++){
                if (hm.containsKey(b[i])){hm.put(b[i],(Integer)hm.get((b[i]))+1);}
                else hm.put(b[i],1);
            }
        }finally {
            br.close();
        }


        for (Object a : hm.keySet()){
            System.out.println("Word "+a +" occurs "+ (Integer)hm.get(a) + " times");
        }
    }
}
