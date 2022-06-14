package p_ms.ms;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

import p_ms.ms.model.GreyModel;
import p_ms.ms.view.GreyView;
import p_ms.ms.view.dialog.EndGameDialog;
import p_ms.ms.view.dialog.FailGameDialog;
import p_ms.ms.view.dialog.GameDialog;
import p_ms.ms.view.dialog.NextGameDialog;
import p_ms.ms.view.niveau.Niveau;

public class Controller{

    private static Controller instance;
    public Niveau niveau;
    public GreyModel model;
    public GreyView greyView;

    private Controller(){}

    public static Controller getInstance(){
        if(instance == null)
            instance = new Controller();
        return instance;
    }

    public AlertDialog.Builder process(){
        GameDialog dialog;
        if(!model.evaluateScore()) {
            dialog = new FailGameDialog();
        }else if(niveau.next() == null) {
            dialog = new EndGameDialog();
        }else dialog = new NextGameDialog();
        return dialog.render(model.score, greyView);
    }

}
