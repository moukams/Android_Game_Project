package p_ms.ms.model;


import p_ms.ms.obervor.Observer;
import p_ms.ms.view.dialog.GameDialog;

public class GreyModel extends Observer{

    public int score;

    @Override
    public void update(Integer t) {
        score = t;
    }

    public boolean evaluateScore(){
        return score > 29;
    }

    public GameDialog outputDialog(){
        return null;
    }

}
