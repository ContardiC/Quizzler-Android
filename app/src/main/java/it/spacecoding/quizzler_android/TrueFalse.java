package it.spacecoding.quizzler_android;

import java.util.Random;

public class TrueFalse {
    private int mQuestionID; // id della domanda del file delle risorse strings.xml
    private boolean mAnswer; // la risposta corretta

    public TrueFalse(int questionResourceID, boolean trueOrFalse){
        mQuestionID = questionResourceID;
        mAnswer = trueOrFalse;
    }

    public int getQuestionID() {
        return mQuestionID;
    }

    public void setQuestionID(int questionID) {
        mQuestionID = questionID;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }
}
