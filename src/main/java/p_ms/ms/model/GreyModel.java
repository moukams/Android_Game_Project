package p_ms.ms.model;


import p_ms.ms.obervor.Observer;

public class GreyModel implements Observer{

    int score;

    @Override
    public void update(Integer t) {
        score = t;
    }

    public boolean evaluateScore(){
        return score > 29;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
