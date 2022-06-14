package p_ms.ms.view.niveau;

import android.graphics.Color;

import p_ms.ms.R;
import p_ms.ms.view.GreyView;

public class Niveau5 implements Niveau{
    @Override
    public void theme(GreyView greyView) {
        greyView.Back.setBackgroundColor(Color.argb(255,143,188,143));
        greyView.Caa= R.mipmap.oo5;
        greyView.Ca=R.mipmap.x5;
        greyView.Cy=620;
        greyView.Ni.setText("Niveau= "+greyView.Niv);
        greyView.music();
        greyView.S.setTextColor(Color.argb(255,50,60,50));
        greyView.T.setTextColor(Color.argb(255,108,70,108));
        greyView.Ni.setTextColor(Color.argb(255,0,0,1));
        greyView.Bt.setTextColor(Color.argb(255,255,255,250));
        greyView.B.setBackgroundColor(Color.argb(100,0,0,0));
    }

    @Override
    public Niveau next() {
        return null;
    }

    @Override
    public int getMusic() {
        return R.raw.t5m;
    }
}
