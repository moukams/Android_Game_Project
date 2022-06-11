package p_ms.ms.view.dialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import p_ms.ms.view.GreyView;

public class FailGameDialog extends GameDialog{


    public FailGameDialog(GreyView greyView) {
        super(greyView);
    }

    public AlertDialog.Builder render(int score){
        AlertDialog.Builder Fin = new AlertDialog.Builder(this.view);
        Fin.setTitle("Votre Score=" + score);
        Fin.setMessage("le Score moyen est 37 point  ");
        Fin.setMessage("le Score mimum doit étre 30 pour passé le Niveau   ");
        GreyView v = this.view;
        Fin.setPositiveButton("Recommancé", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                v.t = 0;
                v.S.setText(v.r+"Score="+score);
                v.A = 0;
                v.Bt.setText("Prét !");
                v.m.removeCallbacks(v.myRunnable);

            }
        });
        Fin.setNegativeButton("Quitez", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                v.finish();
            }
        });

        return Fin;
    }

}
