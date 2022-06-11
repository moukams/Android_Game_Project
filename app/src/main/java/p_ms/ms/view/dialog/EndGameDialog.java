package p_ms.ms.view.dialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import p_ms.ms.R;
import p_ms.ms.view.GreyView;

public class EndGameDialog extends GameDialog{

    public EndGameDialog(GreyView greyView){
        super(greyView);
    }

    @Override
    public AlertDialog.Builder render(int score) {
        AlertDialog.Builder Fin = new AlertDialog.Builder(this.view);
        Fin.setIcon(R.drawable.pu);
        GreyView view = this.view;
        Fin.setPositiveButton("Quitez le jeux", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                view.finish();
            }
        });
        return Fin;
    }
}
