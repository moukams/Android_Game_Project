package p_ms.ms.view;


import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import p_ms.ms.Controller;
import p_ms.ms.R;


public class TempsView extends AppCompatActivity {

    public MediaPlayer P ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temps);
        this.P = MediaPlayer.create(this, R.raw.pret);
        P.start();
    }


    public void CC(View view) {
        P.stop();
        Intent grey = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(grey);
        finish();

    }
}
