package codingbat.logic1;

public class P15_AnswerCell {

    public boolean answerCell(final boolean isMorning, final boolean isMom, final boolean isAsleep) {

        if (isAsleep) {
            return false;
        } else if (isMorning && !isMom) {
            return false;
        }

        return true;
    }
}
