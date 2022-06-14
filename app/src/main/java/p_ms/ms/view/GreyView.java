package p_ms.ms.view;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
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
    ConstraintLayout Back;
    MediaPlayer P;
    Handler m = new Handler();
    GridView gridView;
    View bView;
    GreyView ac ;
    TextView Ni;
    int A=0;
    int score =0;
    int Niv=1;
    int Cy;
    int Caa;
    int Ca;
    String r="";
    TextView S,Bt,T;
    Random ala =new Random();
    int[] image =new int[30];
    List<Observer> observerList = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grey);
        controller.setGreyView(this);
        gridView =(GridView) findViewById(R.id.G) ;
        Bt = (TextView) findViewById(R.id.B);
        bView = (View) findViewById(R.id.B);
        S =(TextView) findViewById(R.id.S) ;
        T =(TextView) findViewById(R.id.T) ;
        Back =(ConstraintLayout) findViewById(R.id.Back) ;
        Ni = (TextView) findViewById(R.id.Ni);
        Ni.setText("Niveau= "+Niv);
        niveau.theme(this);
        controller.setNiveau(this.niveau);
        this.ac=this;
        addObserver(controller.getModel());


     gridView.setOnItemClickListener((parent, v, position, id) -> {
         if(image[position]==Caa) score++;
         else score--;
         notifyObservers(score);
         S.setText(r+"Score="+ score);
     });


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

    public void B(){

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
        controller.setNiveau(this.niveau);
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

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public Niveau getNiveau() {
        return niveau;
    }

    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }

    public AlertDialog.Builder getFin() {
        return Fin;
    }

    public void setFin(AlertDialog.Builder fin) {
        Fin = fin;
    }

    public ConstraintLayout getBack() {
        return Back;
    }

    public void setBack(ConstraintLayout back) {
        Back = back;
    }

    public MediaPlayer getP() {
        return P;
    }

    public void setP(MediaPlayer p) {
        P = p;
    }

    public Handler getM() {
        return m;
    }

    public void setM(Handler m) {
        this.m = m;
    }

    public GridView getGridView() {
        return gridView;
    }

    public void setGridView(GridView gridView) {
        this.gridView = gridView;
    }

    public View getbView() {
        return bView;
    }

    public void setbView(View bView) {
        this.bView = bView;
    }

    public GreyView getAc() {
        return ac;
    }

    public void setAc(GreyView ac) {
        this.ac = ac;
    }

    public TextView getNi() {
        return Ni;
    }

    public void setNi(TextView ni) {
        Ni = ni;
    }

    public int getA() {
        return A;
    }

    public void setA(int a) {
        A = a;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getNiv() {
        return Niv;
    }

    public void setNiv(int niv) {
        Niv = niv;
    }

    public int getCy() {
        return Cy;
    }

    public void setCy(int cy) {
        Cy = cy;
    }

    public int getCaa() {
        return Caa;
    }

    public void setCaa(int caa) {
        Caa = caa;
    }

    public int getCa() {
        return Ca;
    }

    public void setCa(int ca) {
        Ca = ca;
    }

    public String getR() {
        return r;
    }

    public void setR(String r) {
        this.r = r;
    }

    public TextView getS() {
        return S;
    }

    public void setS(TextView s) {
        S = s;
    }

    public TextView getBt() {
        return Bt;
    }

    public void setBt(TextView bt) {
        Bt = bt;
    }

    public TextView getT() {
        return T;
    }

    public void setT(TextView t) {
        T = t;
    }

    public Random getAla() {
        return ala;
    }

    public void setAla(Random ala) {
        this.ala = ala;
    }

    public int[] getImage() {
        return image;
    }

    public void setImage(int[] image) {
        this.image = image;
    }

    public List<Observer> getObserverList() {
        return observerList;
    }

    public void setObserverList(List<Observer> observerList) {
        this.observerList = observerList;
    }

    public CountDownTimer getCo() {
        return Co;
    }

    public void setCo(CountDownTimer co) {
        Co = co;
    }

    public Runnable getMyRunnable() {
        return myRunnable;
    }

    public void setMyRunnable(Runnable myRunnable) {
        this.myRunnable = myRunnable;
    }
}


