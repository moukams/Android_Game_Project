package p_ms.ms;


import android.content.Intent;
import android.media.MediaPlayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class temps extends AppCompatActivity {

    public MediaPlayer P ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temps);
        this.P = MediaPlayer.create(this, R.raw.pret);
     //   P.stop();
        P.start();
    }


    public void CC(View view) {
        P.stop();
        Intent grey = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(grey);
        finish();

    }
}
