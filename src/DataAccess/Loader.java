
package DataAccess;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Loader {
   
    public static String[] getFile(String fileName){
        List<String> lines = new ArrayList<>();
        try{
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            lines.add(line);
        }
        bufferedReader.close();
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        String[] response = new String[lines.size()];
        response = lines.toArray(response);
        return response;
    }
}
