import javax.swing.*;
import java.awt.*;

public class Main {
    private static QuestionAnswer questionAnswer = new QuestionAnswer();

    public static void createGUI() {
        JFrame frame = new JFrame("Test frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("(Test label) Translate it:");
        frame.getContentPane().add(label);

//        JList jList = new JList();
//        frame.getContentPane().add(jList);

//        JTextArea textArea = new JTextArea();
//        frame.getContentPane().add(textArea);

//        JButton button = new JButton("Ответ");
//        frame.getContentPane().add(button);

//        JTable table = new JTable();
//        frame.getContentPane(table);

        frame.setPreferredSize(new Dimension(800, 600));

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        JFrame.setDefaultLookAndFeelDecorated(true);
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createGUI();
            }
        });

        questionAnswer.questionsStart();

        System.out.println("Your result is : " + questionAnswer.getPerCent()  + " % right answers");
    }
}
