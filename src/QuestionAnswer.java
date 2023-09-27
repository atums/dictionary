import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuestionAnswer {
    private RandomKey randomKey = new RandomKey();
    private CreateDict2 createDict = new CreateDict2();
    private Count count = new Count();
    private float perCent;

    public float getPerCent() {
        return perCent;
    }

    public void questionsStart() {
        try {
            createDict.readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while(true) {
            String key = randomKey.getRandomKey();
            String value = CreateDict2.getMapDict().get(key).getAnswer();
            String example = CreateDict2.getMapDict().get(key).getExample();

            if(randomKey.getRandomQuestion() == 0) {
                if(askQuestion(key, value, example) == false) break;
            } else {
                if(askQuestion(value, key, example) == false) break;
            }
        }
    }

    public boolean askQuestion(String question, String answer, String example) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Translate it and press any key that take the answer");
        System.out.println(question);
        sc.nextLine();

        System.out.println("--------------");
        System.out.println("The answer is:");
        System.out.println(answer);
        System.out.println("Example:");
        System.out.println(example);
        System.out.println("Do you answer right? y/n or exit");

        while (true){
            String change = sc.nextLine();

            switch (change) {
                case "y": {
                    count.setCorrect();
                    return true;
                }
                case "n": {
                    count.setWrong();
                    return true;
                }
                case "exit": {
                    perCent = count.perCentRight();
                    sc.close();
                    return false;
                }
            }
        }
    }
}
