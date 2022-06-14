package p_ms.ms.view.niveau;

import android.graphics.Color;

import p_ms.ms.R;
import p_ms.ms.view.GreyView;

public class Niveau1 implements Niveau{

    @Override
    public void theme(GreyView greyView) {
        greyView.Back.setBackgroundResource(R.mipmap.t1);
        greyView.Caa=R.mipmap.oo1;
        greyView.Ca=R.mipmap.x1;
        greyView.Cy=1000;
        greyView.Ni.setText("Niveau= "+ greyView.Niv);
        greyView.music();
        greyView.S.setTextColor(Color.argb(255,255,176,0));
        greyView.T.setTextColor(Color.argb(255,255,176,0));
        greyView.Ni.setTextColor(Color.argb(205,255,117,12));
        greyView.Bt.setTextColor(Color.argb(255,0,0,0));
        greyView.B.setBackgroundColor(Color.argb(255,255,176,0));
    }

    @Override
    public Niveau next() {
        return new Niveau2();
    }

    @Override
    public int getMusic() {
        return R.raw.t1m;
    }
}
