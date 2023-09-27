import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CreateDict {
    private static Integer coin = 0;
    private static String line;
    private static String upLine = null;
    private static String downLine = null;
    private static String fileName = "E:\\!WORK\\Java\\dictionary\\dic.txt";
    private static Map<String, String> mapDict = new HashMap<String, String>();

    public static Map<String, String> getMapDict() {
        return mapDict;
    }

    public static void readFile() throws FileNotFoundException {
        try {
            BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
            while (fileReader.ready()) {
                line = fileReader.readLine();
                checkLine(line);
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void checkLine(String str){
        if(!str.equals(" ")) {
            if(str.contains(" - ")) {
                upLine = str;
                String[] strArr = upLine.split(" - ");
                mapDict.put(strArr[0], strArr[1]);
            } else {
                downLine = str;
            }
        }
        coin++;
    }
}