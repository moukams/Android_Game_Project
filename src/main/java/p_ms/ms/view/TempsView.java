package p_ms.ms.view;


import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import p_ms.ms.R;


public class TempsView extends AppCompatActivity {

    MediaPlayer P ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temps);
        this.P = MediaPlayer.create(this, R.raw.pret);
        P.start();
    }


    public void CC() {
        P.stop();
        Intent grey = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(grey);
        finish();

    }

    public MediaPlayer getP() {
        return P;
    }

    public void setP(MediaPlayer p) {
        P = p;
    }
}
