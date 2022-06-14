package p_ms.ms.view.dialog;

import android.annotation.SuppressLint;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

import p_ms.ms.view.GreyView;

public interface GameDialog {
    AlertDialog.Builder render(int score, GreyView context);
}
