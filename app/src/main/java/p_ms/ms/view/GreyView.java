package p_ms.ms.view;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import p_ms.ms.Controller;
import p_ms.ms.R;
import p_ms.ms.obervor.Observer;
import p_ms.ms.obervor.Subject;
import p_ms.ms.view.niveau.Niveau;
import p_ms.ms.view.niveau.Niveau1;


public class GreyView extends AppCompatActivity implements Subject {

    public Controller controller = Controller.getInstance();
    Niveau niveau = new Niveau1();
    AlertDialog.Builder Fin;
    public ConstraintLayout Back;
    public MediaPlayer P;
    public Handler m = new Handler();
    public GridView gridView;
    public View B;
    public GreyView ac ;
    public TextView Ni;
    public int A=0, score =0 ,Niv=1,Cy ,Caa,Ca,i;
    public String r="";
    public TextView S , Bt,T;
    Random ala =new Random();
    int image[]=new int[30];
    List<Observer> observerList = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grey);
        controller.greyView = this;
        gridView =(GridView) findViewById(R.id.G) ;
        Bt = (TextView) findViewById(R.id.B);
        B = (View) findViewById(R.id.B);
        S =(TextView) findViewById(R.id.S) ;
        T =(TextView) findViewById(R.id.T) ;
        Back =(ConstraintLayout) findViewById(R.id.Back) ;
        Ni = (TextView) findViewById(R.id.Ni);
        Ni.setText("Niveau= "+Niv);
        niveau.theme(this);
        controller.niveau = this.niveau;
        this.ac=this;
        addObserver(controller.model);


     gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                //  ((TextView) v).getText()
                if(image[position]==Caa) {
                    score++;
                    notifyObservers(score);
                    S.setText(r+"Score="+ score);
                } else {
                    score--;
                    notifyObservers(score);
                    S.setText(r+"Score="+ score);
                }
            }});


    }

    public CountDownTimer Co = new CountDownTimer(30 * 1000, 1000) {
        @Override
        public void onTick(long l) {
            T.setText(l/1000+"/30 S");

        }

        @Override
        public void onFinish() {
            Fin = controller.process();
            Fin.setTitle("Votre Score=" + score);
            Bt.setText("Redémarré");
            m.removeCallbacks(myRunnable);
            A = 0;
            score = 0;

            Fin.show();

        }
    };

    public void G() {
        for(int i=0;i<30;i++){
            image[i] = Ca;
        }
        image[ala.nextInt(30)] = Caa;
        p_ms.ms.Adapter adapter=new p_ms.ms.Adapter(this,image);
        gridView.setAdapter(adapter);
    }

    public Runnable myRunnable = new Runnable() {
        public void run() {
            G();
            m.postDelayed(this,Cy);
        }

    };

    public void B(View V){

        if(A==0) {
            m.postDelayed(myRunnable, Cy);A=1;
            score =0;Bt.setText("arréter"); music();Co.start();P.start();
            Toast.makeText(getApplicationContext(),"Start",Toast.LENGTH_SHORT).show();}
        else {
            Bt.setText("Redémarré");m.removeCallbacks(myRunnable);Co.cancel();A=0;P.stop();
            Toast.makeText(getApplicationContext(),"arrét",Toast.LENGTH_SHORT).show();
        }
    }

    public void music() {
        this.P = MediaPlayer.create(this, niveau.getMusic());
    }

    public void updateNiveau(){
        if(niveau.next() != null)
            niveau = niveau.next();
        Niv++;
        score = 0;
        notifyObservers(score);
        controller.niveau = this.niveau;
        this.niveau.theme(this);
    }

    @Override
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void notifyObservers(int score) {
        for (Observer observer : this.observerList) {
            observer.update(score);
        }
    }
}


