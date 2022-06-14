package p_ms.ms.view.niveau;

import android.graphics.Color;

import p_ms.ms.R;
import p_ms.ms.view.GreyView;

public abstract class Niveau {

    public void theme(GreyView greyView){
        greyView.Back.setBackgroundResource(getBackground());
        greyView.Caa= getCaa();
        greyView.Ca= getCa();
        greyView.Cy= getCy();
        greyView.Ni.setText("Niveau= "+ getNiveau());
        greyView.S.setTextColor(getTextColor());
        greyView.T.setTextColor(getTextColor());
        greyView.Ni.setTextColor(getNiveauTextColor());
        greyView.Bt.setTextColor(getBtColor());
        greyView.bView.setBackgroundColor(getViewColor());
        greyView.music();
    }

    protected abstract int getViewColor();

    protected abstract int getBtColor();

    protected abstract int getNiveauTextColor();

    protected abstract int getTextColor();

    protected abstract int getNiveau();

    protected abstract int getCy();

    protected abstract int getCa();

    protected abstract int getCaa();

    protected abstract int getBackground();

    public abstract Niveau next();
    public abstract int getMusic();

}
