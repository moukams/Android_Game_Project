package p_ms.ms.view.niveau;

import android.graphics.Color;

import p_ms.ms.R;
import p_ms.ms.view.GreyView;

public class Niveau4 implements Niveau{
    @Override
    public void theme(GreyView greyView) {
        greyView.Back.setBackgroundResource(R.mipmap.t4);
        greyView.Caa=R.mipmap.oo4;
        greyView.Ca=R.mipmap.x4;
        greyView.Cy=700;
        greyView.Ni.setText("Niveau= "+greyView.Niv);
        greyView.music();
        //   Ni.setTextColor(Integer.parseInt("#FFB300FF"));
        greyView.S.setTextColor(Color.argb(255,112,255,1));
        greyView.T.setTextColor(Color.argb(255,225,116,100));
        greyView.Ni.setTextColor(Color.argb(255,205,117,12));
        greyView.Bt.setTextColor(Color.argb(255,0,0,0));
        greyView.B.setBackgroundColor(Color.argb(255,255,176,0));
    }

    @Override
    public Niveau next() {
        return new Niveau5();
    }

    @Override
    public int getMusic() {
        return R.raw.t4m;
    }
}
