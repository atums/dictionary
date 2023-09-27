public class Count {
    int correct = 0;
    int wrong = 0;
    int summ = 0;
    float percent;

    public void setCorrect() {
        correct++;
    }

    public void setWrong() {
        wrong++;
    }

    public float perCentRight() {
        summ = correct + wrong;
        percent = (correct * 100)/summ; //TODO много полей не упрощаем, возможно понадабяться в дальнейщем для какой-никакой аналитики
        return percent;
    }
}
