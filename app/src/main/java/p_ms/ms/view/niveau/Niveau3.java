package p_ms.ms.view.niveau;

import android.graphics.Color;

import p_ms.ms.R;
import p_ms.ms.view.GreyView;

public class Niveau3 implements Niveau{
    @Override
    public void theme(GreyView greyView) {
        greyView.Back.setBackgroundResource(R.mipmap.t3);
        greyView.Caa=R.mipmap.oo3;
        greyView.Ca=R.mipmap.x3;
        greyView.Cy=800;
        greyView.Ni.setText("Niveau= "+greyView.Niv);
        greyView.music();
        //   Ni.setTextColor(Integer.parseInt("#FFB300FF"));
        greyView.S.setTextColor(Color.argb(255,140,90,53));
        greyView.T.setTextColor(Color.argb(255,0,12,0));
        greyView.Ni.setTextColor(Color.argb(255,126,7,174));
        greyView.Bt.setTextColor(Color.argb(255,0,0,0));
        greyView.B.setBackgroundColor(Color.argb(255,255,176,0));
    }

    @Override
    public Niveau next() {
        return new Niveau4();
    }

    @Override
    public int getMusic() {
        return R.raw.t3m;
    }

}
