package p_ms.ms;
import android.content.DialogInterface;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;


public class Grey extends AppCompatActivity {
    AlertDialog.Builder Fin;
    ConstraintLayout Back;
    public MediaPlayer P;
    public Handler m = new Handler();
    public GridView G;
    public View B;
    public Grey ac ;
    public TextView Ni;
    public int A=0, t=0 ,Niv=1,Cy ,Caa,Ca,i;
    public String r="";
    public TextView S , Bt,T;
    Random ala =new Random();
    int image[]=new int[30];



//////////////////////////////////////////////////////////////////////////////////


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grey);
      G =(GridView) findViewById(R.id.G) ;
       Bt = (TextView) findViewById(R.id.B);
        B = (View) findViewById(R.id.B);
       S =(TextView) findViewById(R.id.S) ;
        T =(TextView) findViewById(R.id.T) ;
        Back =(ConstraintLayout) findViewById(R.id.Back) ;
        Ni = (TextView) findViewById(R.id.Ni);
        Ni.setText("Niveau= "+Niv);

        THEME(Niv);
        this.ac=this;



     G.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                //  ((TextView) v).getText()
                if(image[position]==Caa) {t++;S.setText(r+"Score="+t);}
                else {t--;S.setText(r+"Score="+t);}
            //  Toast.makeText(getApplicationContext(),"toast",Toast.LENGTH_SHORT).show();
            }});


    }

/////////////////////////////////////////////////////////////////////////////////////////



    public CountDownTimer Co = new CountDownTimer(30 * 1000, 1000) {
        @Override
        public void onTick(long l) {
//int W=(int) l ;
            T.setText(l/1000+"/30 S");

        }

        @Override
        public void onFinish() {
            Fin = new AlertDialog.Builder(ac);
            Fin.setTitle("Votre Score=" + t);
           if(t<29) {

                Fin.setMessage("le Score moyen est 37 point  ");
                Fin.setMessage("le Score mimum doit étre 30 pour passé le Niveau   ");
                Fin.setPositiveButton("Recommancé", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        t = 0;
                        S.setText(r+"Score="+t);
                        A = 0;
                        Bt.setText("Prét !");
                        m.removeCallbacks(myRunnable);

                    }
                });
                Fin.setNegativeButton("Quitez", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });

            }
            else {
               if(Niv!=5) {
                   Fin.setMessage("Bravo ! Score minimal attent  ");
                   Fin.setIcon(R.drawable.u);
                   Fin.setPositiveButton("Niveau-Suivant", new DialogInterface.OnClickListener() {
                       @Override
                       public void onClick(DialogInterface dialogInterface, int i) {
                           Niv++;
                           THEME(Niv);

                       }
                   });
                   Fin.setNegativeButton("Re-jouer", new DialogInterface.OnClickListener() {
                       @Override
                       public void onClick(DialogInterface dialogInterface, int i) {
                           t = 0;
                           A = 0;
                           Bt.setText("Prét !");
                           S.setText(r+"Score="+t);
                           m.removeCallbacks(myRunnable);


                       }
                   });

               }
               else { Fin.setMessage("Felisitation vous avez fini le jeux ");
                   Fin.setIcon(R.drawable.pu);
                   Fin.setPositiveButton("Quitez le jeux", new DialogInterface.OnClickListener() {
                       @Override
                       public void onClick(DialogInterface dialogInterface, int i) {
                          finish();
                       }
                   });}

           }
            Bt.setText("Redémarré");
            m.removeCallbacks(myRunnable);
            A = 0;
            t = 0;

            Fin.show();

        }
    };

  public void G()
    {for(int i=0;i<30;i++)
    image[i]=Ca; image[ala.nextInt(30)]=Caa;
        p_ms.ms.Adapter adapter=new p_ms.ms.Adapter(this,image);
        G.setAdapter(adapter); }

    Runnable myRunnable = new Runnable() {
        public void run() {
            G();
            m.postDelayed(this,Cy);}};


    public void B(View V){
//Toast.makeText(getApplicationContext(),"toast",Toast.LENGTH_SHORT).show();
      //  G();

        if(A==0)
        {m.postDelayed(myRunnable, Cy);A=1;t=0;Bt.setText("arréter"); music(Niv);Co.start();P.start();
         Toast.makeText(getApplicationContext(),"Start",Toast.LENGTH_SHORT).show();}
        else
        {Bt.setText("Redémarré");m.removeCallbacks(myRunnable);Co.cancel();A=0;P.stop();
            Toast.makeText(getApplicationContext(),"arrét",Toast.LENGTH_SHORT).show();}
    }
    public void music(int mus) {
        switch (mus)
        {
            case 1 : this.P = MediaPlayer.create(this, R.raw.t1m);break;
            case 2 : this.P = MediaPlayer.create(this, R.raw.t2m);break;
            case 3 : this.P = MediaPlayer.create(this, R.raw.t3m);break;
            case 4 : this.P = MediaPlayer.create(this, R.raw.t4m);break;
            case 5 : this.P = MediaPlayer.create(this, R.raw.t5m);break;
        }
    }
public void THEME( int  Niv)
{ if (Niv==1)
{Back.setBackgroundResource(R.mipmap.t1);
    Caa=R.mipmap.oo1;
    Ca=R.mipmap.x1;
    Cy=1000;
    Ni.setText("Niveau= "+Niv);
  music(Niv);
    //   Ni.setTextColor(Integer.parseInt("#FFB300FF"));
    S.setTextColor(Color.argb(255,255,176,0));
    T.setTextColor(Color.argb(255,255,176,0));
    Ni.setTextColor(Color.argb(205,255,117,12));
    Bt.setTextColor(Color.argb(255,0,0,0));
    B.setBackgroundColor(Color.argb(255,255,176,0));

}
    if (Niv==2)
    {Back.setBackgroundResource(R.mipmap.t2);
        Ca=R.mipmap.oo2;
        Caa=R.mipmap.x2;
        Cy=900;
        Ni.setText("Niveau= "+Niv);
        music(Niv);
     //   Ni.setTextColor(Integer.parseInt("#FFB300FF"));
        S.setTextColor(Color.argb(255,255,176,0));
        T.setTextColor(Color.argb(255,255,176,0));
        Ni.setTextColor(Color.argb(205,255,117,12));
        Bt.setTextColor(Color.argb(255,0,0,0));
        B.setBackgroundColor(Color.argb(255,255,176,0));

    }
    if (Niv==3)
    {Back.setBackgroundResource(R.mipmap.t3);
        Caa=R.mipmap.oo3;
        Ca=R.mipmap.x3;
        Cy=800;
        Ni.setText("Niveau= "+Niv);
        music(Niv);
        //   Ni.setTextColor(Integer.parseInt("#FFB300FF"));
        S.setTextColor(Color.argb(255,140,90,53));
        T.setTextColor(Color.argb(255,0,12,0));
        Ni.setTextColor(Color.argb(255,126,7,174));
        Bt.setTextColor(Color.argb(255,0,0,0));
        B.setBackgroundColor(Color.argb(255,255,176,0));

    }
    if (Niv==4)
    {Back.setBackgroundResource(R.mipmap.t4);
        Caa=R.mipmap.oo4;
        Ca=R.mipmap.x4;
        Cy=700;
        Ni.setText("Niveau= "+Niv);
        music(Niv);
        //   Ni.setTextColor(Integer.parseInt("#FFB300FF"));
        S.setTextColor(Color.argb(255,112,255,1));
        T.setTextColor(Color.argb(255,225,116,100));
        Ni.setTextColor(Color.argb(255,205,117,12));
        Bt.setTextColor(Color.argb(255,0,0,0));
        B.setBackgroundColor(Color.argb(255,255,176,0));

    }
    if (Niv==5)
    {Back.setBackgroundColor(Color.argb(255,143,188,143));
        Caa=R.mipmap.oo5;
        Ca=R.mipmap.x5;
        Cy=620;
        Ni.setText("Niveau= "+Niv);
        music(Niv);
        //   Ni.setTextColor(Integer.parseInt("#FFB300FF"));
        S.setTextColor(Color.argb(255,50,60,50));
        T.setTextColor(Color.argb(255,108,70,108));
        Ni.setTextColor(Color.argb(255,0,0,1));
        Bt.setTextColor(Color.argb(255,255,255,250));
        B.setBackgroundColor(Color.argb(100,0,0,0));

    }

}



}


