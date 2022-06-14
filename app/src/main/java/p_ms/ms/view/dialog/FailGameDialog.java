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
            context.setScore(0);
            context.getS().setText(context.getR()+"Score="+score);
            context.setA(0);
            context.getBt().setText("Prét !");
            context.getM().removeCallbacks(context.myRunnable);

        });
        Fin.setNegativeButton("Quitez", (dialogInterface, i) -> context.finish());

        return Fin;
    }

}
