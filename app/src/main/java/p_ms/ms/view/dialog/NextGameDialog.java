package p_ms.ms.view.dialog;

import android.support.v7.app.AlertDialog;

import p_ms.ms.R;
import p_ms.ms.view.GreyView;

public class NextGameDialog implements GameDialog{


    @Override
    public AlertDialog.Builder render(int score, GreyView context) {
        AlertDialog.Builder Fin = new AlertDialog.Builder(context);
        Fin.setMessage("Bravo ! Score minimal attent  ");
        Fin.setIcon(R.drawable.u);
        Fin.setPositiveButton("Niveau-Suivant", (dialogInterface, i) -> context.updateNiveau());
        Fin.setNegativeButton("Re-jouer", (dialogInterface, i) -> {
            context.setScore(0);
            context.setA(0);
            context.getBt().setText("Prét !");
            context.getS().setText(context.r+"Score="+score);
            context.getM().removeCallbacks(context.myRunnable);
        });

        return Fin;
    }


}
