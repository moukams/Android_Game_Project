package p_ms.ms.view.dialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import p_ms.ms.view.GreyView;

public class FailGameDialog implements GameDialog{


    public AlertDialog.Builder render(int score, GreyView context){
        AlertDialog.Builder Fin = new AlertDialog.Builder(context);
        Fin.setTitle("Votre Score=" + score);
        Fin.setMessage("le Score moyen est 37 point  ");
        Fin.setMessage("le Score mimum doit étre 30 pour passé le Niveau   ");
        Fin.setPositiveButton("Recommancé", (dialogInterface, i) -> {
            context.score = 0;
            context.S.setText(context.r+"Score="+score);
            context.A = 0;
            context.Bt.setText("Prét !");
            context.m.removeCallbacks(context.myRunnable);

        });
        Fin.setNegativeButton("Quitez", (dialogInterface, i) -> context.finish());

        return Fin;
    }

}
