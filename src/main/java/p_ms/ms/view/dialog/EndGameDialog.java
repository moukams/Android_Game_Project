package p_ms.ms.view.dialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import p_ms.ms.R;
import p_ms.ms.view.GreyView;

public class EndGameDialog implements GameDialog {

    @Override
    public AlertDialog.Builder render(int score, GreyView context) {
        AlertDialog.Builder Fin = new AlertDialog.Builder(context);
        Fin.setIcon(R.drawable.pu);
        Fin.setPositiveButton("Quitez le jeux", (dialogInterface, i) -> context.finish());
        return Fin;
    }
}
