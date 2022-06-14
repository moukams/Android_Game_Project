package p_ms.ms;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
public MediaPlayer P;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
P= MediaPlayer.create(this,R.raw.pret);
P.start();
        findViewById(R.id.b).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
P.stop();
                Intent grey = new Intent(getApplicationContext(), Grey.class);
                startActivity(grey);
                finish(); }
        });
        findViewById(R.id.p1).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                P.stop();
                Intent grey = new Intent(getApplicationContext(), temps.class);
                startActivity(grey);
                finish(); }
        });
    }
}
