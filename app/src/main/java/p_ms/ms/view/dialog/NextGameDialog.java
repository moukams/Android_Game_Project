package p_ms.ms.view.dialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import p_ms.ms.R;
import p_ms.ms.view.GreyView;

public class NextGameDialog extends GameDialog{

    public NextGameDialog(GreyView greyView) {
        super(greyView);
    }

    @Override
    public AlertDialog.Builder render(int score) {
        AlertDialog.Builder Fin = new AlertDialog.Builder(this.view);
        Fin.setMessage("Bravo ! Score minimal attent  ");
        Fin.setIcon(R.drawable.u);
        GreyView view = this.view;
        Fin.setPositiveButton("Niveau-Suivant", (dialogInterface, i) -> view.updateNiveau());
        Fin.setNegativeButton("Re-jouer", (dialogInterface, i) -> {
            view.score = 0;
            view.A = 0;
            view.Bt.setText("Prét !");
            view.S.setText(view.r+"Score="+score);
            view.m.removeCallbacks(view.myRunnable);
        });

        return Fin;
    }


}
