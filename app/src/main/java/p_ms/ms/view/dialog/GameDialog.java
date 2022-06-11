package p_ms.ms.view.dialog;

import android.support.v7.app.AlertDialog;

import p_ms.ms.view.GreyView;

public abstract class GameDialog {

    public GreyView view;

    public GameDialog(GreyView greyView){
        this.view = greyView;
    }

    public abstract AlertDialog.Builder render(int score);

}
