import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CreateDict2 {
    //TODO Это класс для замены CreateDict и реализовать решение с примерами
    private static Integer coin = 0;
    private static String line;
    private static String upLine = null;
    private static String downLine = null;
    private static String fileName = "E:\\!WORK\\Java\\dictionary\\dic.txt";
    private static HashMap<String, Value> mapDict = new HashMap<String, Value>();

    public static Map<String, Value> getMapDict() {
        return mapDict;
    }

    public static void readFile() throws FileNotFoundException {
        try {
            BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
            while (fileReader.ready()) {
                line = fileReader.readLine();

                if(!line.equals(" ")) {
                    downLine = fileReader.readLine();
                    if(!downLine.contains("*")) {
                        downLine = "none";
                    }
                }
                checkLine(line, downLine);
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void checkLine(String str, String example){
        if(!str.equals(" ")) {
            if(str.contains(" - ")) {
                upLine = str;
                String[] strArr = upLine.split(" - ");
                mapDict.put(strArr[0], new Value(strArr[1], downLine));
            }
        }
        coin++;
    }
}
