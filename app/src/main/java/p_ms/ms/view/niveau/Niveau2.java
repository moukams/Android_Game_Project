package p_ms.ms.view.niveau;

import android.graphics.Color;

import p_ms.ms.R;
import p_ms.ms.view.GreyView;

public class Niveau2 implements Niveau{
    @Override
    public void theme(GreyView greyView) {
        greyView.Back.setBackgroundResource(R.mipmap.t2);
        greyView.Ca=R.mipmap.oo2;
        greyView.Caa=R.mipmap.x2;
        greyView.Cy=900;
        greyView.Ni.setText("Niveau= "+greyView.Niv);
        greyView.music();
        greyView.S.setTextColor(Color.argb(255,255,176,0));
        greyView.T.setTextColor(Color.argb(255,255,176,0));
        greyView.Ni.setTextColor(Color.argb(205,255,117,12));
        greyView.Bt.setTextColor(Color.argb(255,0,0,0));
        greyView.bView.setBackgroundColor(Color.argb(255,255,176,0));
    }

    @Override
    public Niveau next() {
        return new Niveau3();
    }

    @Override
    public int getMusic() {
        return R.raw.t2m;
    }

}
