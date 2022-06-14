package p_ms.ms.view;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import p_ms.ms.Controller;
import p_ms.ms.R;
import p_ms.ms.model.GreyModel;

public class MainActivity extends AppCompatActivity {

    public MediaPlayer P;
    public Controller controller = Controller.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        controller.model = new GreyModel();
        setContentView(R.layout.activity_main);
        P= MediaPlayer.create(this,R.raw.pret);
        P.start();
        findViewById(R.id.b).setOnClickListener(view -> openIntent(GreyView.class));
        findViewById(R.id.p1).setOnClickListener(view -> openIntent(TempsView.class));
    }

    public void openIntent(Class intentClass){
        Intent intent = new Intent(getApplicationContext(), intentClass);
        startActivity(intent);
        finish();
    }
}
