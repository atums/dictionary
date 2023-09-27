import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomKey {
    Random random = new Random();

    public String getRandomKey() {
        List<String> keys = new ArrayList<String>(CreateDict2.getMapDict().keySet());
        String randomKey = keys.get( random.nextInt(keys.size()) );
        return randomKey;
    }

    public Integer getRandomQuestion() {
        int randomNumber = 0 + (int) (Math.random() * 2);
        return randomNumber;
    }
}
